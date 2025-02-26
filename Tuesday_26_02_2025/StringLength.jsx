import { useState } from "react"
function Operation2(props){
    if(props.word.length%2==0) { return <h1>Length of {props.word} is Even(if else)</h1>} 
    else{ return <h1>Length of {props.word} is Odd (if else)</h1>}
}
function StringLength(){
    const [word,setWord]=useState("word");
    const allocation=(obj)=>{
        setWord(obj.target.value.trim())
    }
    return(<>
    <label>Enter the word :</label>
    <input type="text" onChange={allocation}></input>
    {word.length%2==0 ? <h1>Length of {word} is Even (Terinary Method)</h1> : <h1>Length of {word} is Odd (Terinary Method)</h1>}
    <Operation2 word={word}/>
    </>)
}

export default StringLength