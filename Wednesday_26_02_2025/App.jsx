import StudentList from "./Components/StudentList";
import UserCardChecker from "./Components/UserCardChecker";
import DivisibleBy16Checker from "./Components/DivisibleBy16Checker";

function App() {
  return (
    <>
      <StudentList />
      <UserCardChecker hasAadhar={true} hasPAN={true} />
      <DivisibleBy16Checker number={32} />
    </>
  );
}

export default App;

