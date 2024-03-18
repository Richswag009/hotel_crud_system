import React, { useEffect, useState } from "react";
import Navbar from "./navbar";
import axios from "axios";

const Home = () => {
  const [rooms, setRooms] = useState([]);
  const onFetchHotels = async () => {
    try {
      const response = await axios.get("http://localhost:8080/api/v1/hotel");
      console.log(response);
      const data = await response.data;
      console.log(data);
      setRooms(data);
    } catch (error) {
      console.log(error.message);
    }
  };

  useEffect(() => {
    onFetchHotels();
  }, []);

  return (
    <div>
      <Navbar />

      <div className="grid gap-8 grid-cols-1 md:grid-cols-3 my-4">
        {rooms?.map((room, i) => {
          return (
            <div
              key={i}
              className=" max-w-80 space-y-2  p-4 border border-[#b3b1b1] rounded-md"
            >
              <img
                src="https://img.freepik.com/free-photo/modern-studio-apartment-design-with-bedroom-living-space_1262-12375.jpg?w=740&t=st=1710770862~exp=1710771462~hmac=6946639d2f04744489651dfcffca943c30fdee7b9c4d04dae6596b3cc1321a70"
                alt=""
              />
              <div className="">
                <h1>Room Type: {room.roomType}</h1>
                <p>Room Number: {room.roomNumber}</p>
                <span>Price: {room.price}</span>
              </div>
            </div>
          );
        })}
      </div>
    </div>
  );
};

export default Home;
