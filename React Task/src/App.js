import React, { useState, useEffect } from "react";
import axios from "axios";
import "bootstrap/dist/css/bootstrap.min.css";
import ChildComponent from "./components/ChildComponent";
import FormComponent from "./components/FormComponent";

const API_URL = "http://localhost:5000/posts"; // Local API

const App = () => {
  const [data, setData] = useState([]);

  // Fetch Data from API
  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = () => {
    axios
      .get(API_URL)
      .then((response) => setData(response.data))
      .catch((error) => console.error("Error fetching data:", error));
  };

  // Handle Form Submission (POST Request)
  const handleFormSubmit = async (value) => {
    try {
      const newPost = { title: value };
      await axios.post(API_URL, newPost);
      fetchData(); // Refresh data after adding new post
    } catch (error) {
      console.error("Error adding post:", error);
    }
  };

  return (
    <div className="container mt-4">
      <h2 className="text-center">React with JSON-Server</h2>

      <FormComponent onSubmit={handleFormSubmit} />

      <ChildComponent data={data} />
    </div>
  );
};

export default App;
