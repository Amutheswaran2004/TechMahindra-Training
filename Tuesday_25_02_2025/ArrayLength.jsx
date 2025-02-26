import React from "react";

const ArrayLength = () => {
  const array1 = [9, 4, 24];
  const array2 = [9, 24];

  const checkLengthIfElse = (array) => {
    if (array.length % 3 === 0) {
      return "is a multiple of 3";
    } else {
      return "is not a multiple of 3";
    }
  };

  const checkLengthLogicalAnd = (array) => {
    return (
      (array.length % 3 === 0 && "is a multiple of 3") ||
      "is not a multiple of 3"
    );
  };

  const checkLengthTernary = (array) => {
    return array.length % 3 === 0
      ? "is a multiple of 3"
      : "is not a multiple of 3";
  };

  return (
    <div>
      <h1>Array Length Check</h1>

      <h3>Using If-Else:</h3>
      <p>Array 1: {checkLengthIfElse(array1)}</p>
      <p>Array 2: {checkLengthIfElse(array2)}</p>

      <h3>Using Logical AND (&&):</h3>
      <p>Array 1: {checkLengthLogicalAnd(array1)}</p>
      <p>Array 2: {checkLengthLogicalAnd(array2)}</p>

      <h3>Using Ternary Operator:</h3>
      <p>Array 1: {checkLengthTernary(array1)}</p>
      <p>Array 2: {checkLengthTernary(array2)}</p>
    </div>
  );
};

export default ArrayLength;
