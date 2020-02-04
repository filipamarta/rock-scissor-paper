let error = console.log("something went wrong!");

const getUserChoice = userInput => {
  userInput = userInput.toLowerCase();
  
  if (userInput === "rock" 
      || userInput === "paper" 
      || userInput === "scissor" 
      || userInput === "bomb"){
    return userInput;
  } else {
    return error;
  }
};

const getComputerChoice = () => {
  let random = Math.floor(Math.random() * 2);
  
  if(random === 0){
    return "rock";
  } else if (random === 1) {
    return "paper";
  } else {
    return "scissor";
  }
};

const determineWinner = (userChoice, computersChoice) => {
  if (userChoice === computersChoice) {
    return console.log("Game is tie");
  } else if (userChoice === "rock") {
    if (computersChoice === "paper") {
      return console.log("Computer won!");
    } else {
      return console.log("User won!");
    }
  } else if (userChoice === "paper") {
    if (computersChoice === "rock") {
      return console.log("User won!");
    } else {
      return console.log("Computer won!");
    }
  } else if (userChoice === "scissor") {
    if (computerChoice === "rock") {
      return console.log("Computer won!");
    } else {
      return console.log("User won");
    }
  } else if (userChoice === "bomb"){
    return console.log("User won!!")
  } else {
    return error;
  }
};

const playGame = () => {
  const userChoice = getUserChoice("bomb");
  const computerChoice = getComputerChoice();
  
  console.log(`userChoice: ${userChoice}`);
  console.log(`computerChoice: ${computerChoice}`);
  
  console.log(determineWinner(userChoice, computerChoice));
};

playGame();
