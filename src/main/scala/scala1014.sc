val validUsername = List("pop", "jazz")
val validPassword = List("112233", "123456")
def authenaticate(username:String, password:String) ={
  (username,password) match
    {
    case(x,y) if validUsername.contains(x)  && validPassword.contains(y) => true
    case _ => false
  }
  }

authenaticate("ffdf","rer")

val isUserNameValid = (username:String) => validUsername.contains(username)
val isPassWordValid = (password:String) => validPassword.contains(password)

val authenticateFunction = (username:String,password:String) => {
  val validityOfUserName: Boolean = isUserNameValid(username)
  val validityOfPassWord: Boolean = isUserNameValid(password)

  if (validityOfUserName && validityOfPassWord){
    true
  }
  else{
    false
  }
  
}


def newFunction ={
  val x =1
}