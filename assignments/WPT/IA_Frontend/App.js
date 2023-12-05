import {Route, Routes, Link, BrowserRouter} from 'react-router-dom'
import './App.css';
import {ToastContainer} from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'
import Signin from './pages/Signin';
import Home from './pages/Home';
import Signup from './pages/Signup';
import EditStudent from './pages/Home/edit';
import AllStudents from './pages/Home/allstudents';
import Refresh from './pages/Test/test';



function App() {
  return (
    <div className="container">
      <BrowserRouter>
      <Routes>
        <Route path="/signin" element={<Signin />} />
        <Route path="/home" element={<Home />} />
        <Route path="/signup" element={<Signup />} />
        <Route path="/edit" element={<EditStudent />} />
        <Route path="/getall" element={<AllStudents />} />
        <Route path="/refresh" element={<Refresh />} />
      </Routes>
      </BrowserRouter>
      <ToastContainer theme="colored" />
    </div>
  );
}

export default App;
