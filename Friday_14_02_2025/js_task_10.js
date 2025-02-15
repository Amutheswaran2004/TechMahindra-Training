// 10. Get the Maths score of a student. If the mark is 100, display "Phenomenal!" . Else if the mark is greater than 85, display "Excellent!". Else, if the mark is between 71 to 85, display "Good work!". Else, if the mark is between 51 to 70, display "Practice well!". Else, display "Hard work is needed"

var score=85
if(score==100){
    console.log("Phenomenal !")
}
else if(score>85){
    console.log("Excellent !")
}
else if(score<=85 && score >= 71){
    console.log("Good Work !")
}
else if(score<=70 && score >= 51){
    console.log("Practice well !")
}
else{
    console.log("Hard work is needed")
}
