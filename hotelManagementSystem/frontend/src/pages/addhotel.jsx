import React, { useState } from "react";

const Addhotel = () => {
  const [roomNumber, setRoomNumber] = useState("");
  const [roomType, setRoomType] = useState("");
  const [price, setPrice] = useState("");

  return (
    <div className=" mt-20  mx-auto flex justify-center ">
      <form
        action=""
        method="post"
        className="flex flex-col gap-4 max-w-96 my-10"
      >
        <div className="flex flex-col">
          <label htmlFor="name">Enter Room Number</label>
          <input
            type="text"
            name="roomNumber"
            id="name"
            value={roomNumber}
            placeholder="Enter Room Number"
            onChange={(e) => setRoomNumber(e.target.value)}
            required
          />
        </div>
        <div className=" flex flex-col">
          <label htmlFor="name">RoomType</label>

          <select
            onChange={(e) => setRoomType(e.target.value)}
            type="text"
            name="roomType"
            value={roomType}
            placeholder="Enter Room type"
            required
            className="form-select"
          >
            <option value="">select room type</option>
            <option value="">select room type</option>
            <option value="">select room type</option>
            <option value="">select room type</option>
            <option value="">select room type</option>
          </select>
        </div>
        <div className="flex flex-col">
          <label htmlFor="name">Price</label>
          <input
            type="text"
            name="price"
            value={price}
            placeholder="Enter Price"
            onChange={(e) => setPrice(e.target.value)}
            required
          />
        </div>
      </form>
    </div>
  );
};

export default Addhotel;
