package com.example.demo.service;

	@Service
	@Transactional
	@RequiredArgsConstructor
	public class AuthServiceImpl implements AuthService {

	    private final UserRepository userRepository;
	    private final PasswordEncoder passwordEncoder;
	    private final AuthenticationManager authenticationManager;
	    private final JwtUtil jwtUtil;

	    @Override
	    public boolean userRegistration(RegisterRequest request) {
	        Optional<User> isUserExists = userRepository.findByEmail(request.getEmail());
	        if (!isUserExists.isPresent()) {
	            var user = User.builder()
	                    .name(request.getName())
	                    .email(request.getEmail())
	                    .password(passwordEncoder.encode(request.getPassword()))
	                    .isEnabled(true)
	                    .role(Role.valueOf(request.getRole().toUpperCase()))
	                    .build();
	            userRepository.save(user);
	            return true;
	        } else {
	            return false;
	        }
	    }

	    @Override
	    public AuthenticationResponse userAuthentication(AuthenticationRequest request) {
	        authenticationManager.authenticate(
	                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
	        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
	        var token = jwtUtil.generateToken(user);
	        return AuthenticationResponse.builder()
	                .token(token)
	                .uid(user.getUid())
	                .build();
	    }
	}


