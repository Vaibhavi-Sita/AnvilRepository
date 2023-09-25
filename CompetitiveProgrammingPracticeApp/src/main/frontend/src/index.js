import React from 'react'
import ReactDOM from 'react-dom/client'

import './index.css'

function Greeting() {
  return (
    <div>
      <Person />
      <Message />
    </div>
  )
}

const Person = () => <h2>sita</h2>
const Message = () => {
  return <p>this is a message</p>
}

const root = ReactDOM.createRoot(document.getElementById('root'))

root.render(<Greeting />)
