export default function StudentList() {
    const students = [
      { name: "Amudesh", department: "ECE" },
      { name: "Gowtham", department: "ECE" },
      { name: "Karthik", department: "IT" }
    ];
  
    return (
      <div>
        <h2 >Student List</h2>
        <ul>
          {students.map((student, index) => (
            <li key={index}>
              {student.name} - {student.department}
            </li>
          ))}
        </ul>
      </div>
    );
  }