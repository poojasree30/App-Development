package config;

	@Component
	@RequiredArgsConstructor
	public class JwtAuthenticationFilter extends OncePerRequestFilter {

	    private final JwtUtil jwtUtil;
	    private final UserDetailsService userDetailsService;

	    @Override
	    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
	            throws ServletException, IOException {
	        final String authHeader = request.getHeader("Authorization");
	        final String token;
	        final String email;
	        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
	            filterChain.doFilter(request, response);
	            return;
	        }
	        token = authHeader.substring(7);
	        email = jwtUtil.extractUserEmail(token);
	        if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
	            UserDetails userDetails = this.userDetailsService.loadUserByUsername(email);
	            if (jwtUtil.isTokenValid(token, userDetails)) {
	                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
	                        email, null, userDetails.getAuthorities());
	                usernamePasswordAuthenticationToken
	                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
	            }
	        }
	        filterChain.doFilter(request, response);
	    }

	}

