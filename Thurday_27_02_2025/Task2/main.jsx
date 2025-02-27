import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import AnimatedCursor from 'react-animated-cursor'
import Component1 from './Component1.jsx'
createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Component1></Component1>
    <App />
  </StrictMode>,
)
