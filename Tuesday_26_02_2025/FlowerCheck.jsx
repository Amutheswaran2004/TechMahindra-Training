import React, { useState } from "react";

const FlowerCheck = () => {
  const flowers = ["Rose", "Jasmine", "Lotus"];
  const [input, setInput] = useState("");
  const [resultIfElse, setResultIfElse] = useState("");
  const [resultAnd, setResultAnd] = useState("");
  const [resultTernary, setResultTernary] = useState("");

  const handleChange = (e) => setInput(e.target.value);

  const checkFlower = () => {
    if (flowers.includes(input)) {
      setResultIfElse("It is a flower.");
    } else {
      setResultIfElse("It is not a flower.");
    }


    setResultAnd(
      (flowers.includes(input) && "It is a flower.") || "It is not a flower."
    );

    setResultTernary(
      flowers.includes(input) ? "It is a flower." : "It is not a flower."
    );
  };

  return (
    <div>
      <h2>Flower Checker</h2>
      <input
        type="text"
        value={input}
        onChange={handleChange}
        placeholder="Enter flower name"
      />
      <button onClick={checkFlower}>Check</button>

      <h3>Results:</h3>
      <p>
        <strong>If-Else:</strong> {resultIfElse}
      </p>
      <p>
        <strong>Logical AND (&&):</strong> {resultAnd}
      </p>
      <p>
        <strong>Ternary Operator:</strong> {resultTernary}
      </p>
    </div>
  );
};

export default FlowerCheck;
