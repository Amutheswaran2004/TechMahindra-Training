import { useState } from "react"

function Operation1(props){
    const num=props.num
if(num%13===0){
    return <h1>Yes {num} is divisible by 13 (if else method) </h1>
}else{
    return <h1>{num} is not divible by 13</h1>
}

}

function Operation2(props)
{
    const num=props.num
return( <>
{num%13 === 0 && <h1>Yes {num} is divisible by 13 (Logical Method) </h1>}
{num%13 !== 0 && <h1> {num} is not divible by 13</h1>}
</>
)
}
function Operation3(props){

    return( props.num%13===0 ? <h1>Yes {props.num} is divisible by 13 (Terinary Method)</h1> :<h1> {props.num} is not divible by 13</h1>)
}

function Validate(){
    const [num,setNum]=useState();
    const allocation=(obj)=>{
    setNum(obj.target.value)
    }
   return(<>
   <label>Enter the Number :</label>
   <input type="number" onChange={allocation}></input>
    <Operation1 num={num}/>
    <Operation3 num={num}/>
    <Operation2 num={num}/>
    </>)
}


export default Validate