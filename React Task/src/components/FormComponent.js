import React, { useState } from "react";

const FormComponent = ({ onSubmit }) => {
  const [inputValue, setInputValue] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!inputValue.trim()) return;
    onSubmit(inputValue);
    setInputValue("");
  };

  return (
    <form onSubmit={handleSubmit} className="mt-3">
      <input
        type="text"
        className="form-control"
        placeholder="Enter post title"
        value={inputValue}
        onChange={(e) => setInputValue(e.target.value)}
      />
      <button type="submit" className="btn btn-primary mt-2">Add Post</button>
    </form>
  );
};

export default FormComponent;
