import React from "react";

const ChildComponent = ({ data }) => {
  return (
    <div className="card p-3 mt-3">
      <h4>Fetched Data:</h4>
      {data.length > 0 ? (
        <ul className="list-group">
          {data.map((item) => (
            <li key={item.id} className="list-group-item">{item.title}</li>
          ))}
        </ul>
      ) : (
        <p>No data available.</p>
      )}
    </div>
  );
};

export default ChildComponent;
