import logo from './logo.svg';
import Untitle from "./Untitled.png";
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <img src={Untitle} alt='uahlogo'/>
        <p>
          Tests of <code>playwright</code> for Software Engineering.
        </p>
        <p>
          Group 1: Daniel Allo, Daniel Colado, Alexandra Raileau
        </p>
      </header>
    </div>
  );
}

export default App;
