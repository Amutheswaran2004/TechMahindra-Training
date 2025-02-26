export default function UserCardChecker({ hasAadhar, hasPAN }) {
    const checkCards = () => {
      if (hasAadhar || hasPAN) {
        return `User has ${hasAadhar ? "Aadhar Card" : ""} ${hasAadhar && hasPAN ? "and" : ""} ${hasPAN ? "PAN Card" : ""}`;
      } else {
        return "User does not have Aadhar Card or PAN Card";
      }
    };
  
    return (
      <div>
        <h2>Card Availability Checker</h2>
        <p >{checkCards()}</p>
      </div>
    );
  }
  