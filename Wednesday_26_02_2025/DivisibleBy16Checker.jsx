export default function DivisibleBy16Checker({ number }) {
    const checkDivisibility = () => {
      if (number % 16 === 0) {
        return "Yes, the number is divisible by 16";
      } else {
        return "No, the number is not divisible by 16";
      }
    };
  
    return (
      <div >
        <h2 className>Divisibility Checker</h2>
        <p className>Number: {number}</p>
        <p className>{checkDivisibility()}</p>
      </div>
    );
  }