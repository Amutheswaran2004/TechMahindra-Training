import React, { useState } from "react";

function CheckVowel({ text = "" }) {
  const [inputText, setInputText] = useState(text);
  const hasVowel = /[aeiou]/i.test(inputText);

  const askText = () => {
    const newText = prompt("Enter a string to check for vowels:");
    if (newText !== null) setInputText(newText);
  };

  function usingIf(str) {
    if (/[aeiou]/i.test(str)) {
      return <p>Using IF: The string "{str}" contains vowels.</p>;
    } else {
      return <p>Using IF: The string "{str}" does not contain vowels.</p>;
    }
  }

  return (
    <div className="container">
      <h2>Using IF:</h2>
      {usingIf(inputText)}
      <br />

      <h2>Using Logical &&:</h2>
      {hasVowel && <p>Using &&: The string "{inputText}" contains vowels.</p>}
      {!hasVowel && (
        <p>Using &&: The string "{inputText}" does not contain vowels.</p>
      )}
      <br />

      <h2>Using Ternary Operator:</h2>
      <p>
        Using Ternary: The string "{inputText}"{" "}
        {hasVowel ? "contains" : "does not contain"} vowels.
      </p>
      <br />
      <br />

      <button onClick={askText}>Enter New String</button>
    </div>
  );
}

export default CheckVowel;
