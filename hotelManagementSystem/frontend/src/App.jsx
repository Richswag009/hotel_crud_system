import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.css";
import Home from "./components/home";
import Addhotel from "./pages/addhotel";
import Navbar from "./components/navbar";

function App() {
  return (
    <BrowserRouter>
      {/* <Navbar> */}
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/add" element={<Addhotel />} />
      </Routes>
      {/* </Navbar> */}
    </BrowserRouter>
  );
}

export default App;
