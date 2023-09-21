import IMAGE from './logo.jpg'
import './Home.css'
import store from './store';

function Home() {
  const name =store.getState().name.name
  return (
<div className='wrap'>  
    <div className="Header">
      <h1 className='title'>NIPO</h1>
      <div className='cards'>
      <div className='btn'> 
      <img src='https://d35aaqx5ub95lt.cloudfront.net/vendor/784035717e2ff1d448c0f6cc4efc89fb.svg'/> 
      <p className='txt'>LEARN</p>
      </div>
      <div className='btn'>  
      <img className='im'src='https://d35aaqx5ub95lt.cloudfront.net/vendor/597da4049ec7b1ee932d1b95ca424e0d.svg'/>
      <p className='txt'>LETTERS</p>
      </div>
      <div className='btn'> 
      <img className='im'src='https://d35aaqx5ub95lt.cloudfront.net/vendor/ca9178510134b4b0893dbac30b6670aa.svg'/> 
      <p className='txt'>LEADERBOARD</p>
      </div>
      <div  className='btn'>  
      <img className='im'src='https://d35aaqx5ub95lt.cloudfront.net/vendor/7ef36bae3f9d68fc763d3451b5167836.svg'/>
      <p className='txt'>QUESTS</p>
      </div>
      <div  className='btn'>  
      <img className='im'src='https://d35aaqx5ub95lt.cloudfront.net/vendor/0e58a94dda219766d98c7796b910beee.svg'/>
      <p className='txt'>SHOP</p>
      </div>
      <div className='btn'>  
      <img className='im'src='https://simg-ssl.duolingo.com/avatars/1265336797/pf242vSyXG/medium'/>
      <p className='txt'>PROFILE</p>
      </div>
      <div className='btn'> 
      <img className='im'src='https://d35aaqx5ub95lt.cloudfront.net/vendor/7159c0b5d4250a5aea4f396d53f17f0c.svg'/> 
      <p>MORE</p>
      </div>
      </div>
    </div>
    <div className='welcome'> 
    <p>UNIT 1 </p>
    <br></br>
    <p>PAIR LETTERS AND SOUNDS</p>
    </div>
    <div className='profile' >
      <h1 className='greet-person-home'>Welcome {name}</h1>
    </div>
    <div className='progress'>
    <img className='im'src='data:image/png;base64,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'/> 
    </div>
    </div>
    
  );
}
export default Home;