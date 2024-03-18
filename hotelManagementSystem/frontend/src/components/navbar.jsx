import React from "react";
import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <nav className="flex justify-between">
      <h1>logo</h1>
      <div className="flex justify-between align-middle  text-2xl text-center gap-8 ">
        <Link to={"/"}>
          <li className=" list-none">Home</li>
        </Link>
        <Link to={"/add"}>
          <li className="list-none">Add</li>
        </Link>
      </div>
    </nav>
  );
};

export default Navbar;
