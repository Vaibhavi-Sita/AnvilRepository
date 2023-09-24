import React from 'react'
import ReactDOM from 'react-dom/client'

function Greeting() {
  return <h2>Hello World</h2>
}

const Person = () => <h2>sita</h2>
const Message = () => {
  return <p>this is a message</p>
}

const root = ReactDOM.createRoot(document.getElementById('root'))

root.render(<Greeting />)
