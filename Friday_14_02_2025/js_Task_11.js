// 11. Get the day of a week and perform the following using switch statement. If its Monday, display "Start of the week!" If its Tuesday, Wednesday or Thursday, display "Mid of the week!". If its Friday, display "Last working day of the week!". If its Saturday, display "WeekEnd - Saturday!". If its Sunday, display "WeekEnd - Sunday!".  If the input is not a day of the week, display "Invalid input!".
var day="Friday"
switch(day){
    case "Sunday":
        {
        console.log("WeekEnd - Sunday!")
         break
        }
          case "Monday":
        {
        console.log("Start of the week")
        break
        }
          case "Tuesday":
        {
        console.log("Mid of the week!")
        break
        }
          case "Wednesday":
        {
        console.log("Mid of the week!")
        break
        }
          case "Thursday":
        {
        console.log("Mid of the week!")
        break
        }
          case "Friday":
        {
        console.log("Last working day of the week!")
        break
        }
          case "Saturday":
        {
        console.log("WeekEnd - Saturday!")
        break
        }
        default :
          console.log("Invalid input!")
        }