import './App.css';
import AppBar from './components/Appbar';
import AddUser from './components/AddUser';
import LoginUser from './components/LoginUser';

export function App() {
  return (
    <div className="App">
      <AppBar/>
      <AddUser/>
      <LoginUser/>
    </div>
  );
}

