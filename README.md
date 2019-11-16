# RoomHunt
Andriod Project
Introduction (or) Problem/Issue:
Room Hunt is regarding the availability of rooms in Horizons West Apartment for Northwest Missouri State University Students according to their preferences and for who wish to fill their vacancies.
<ul><li>	Save Time: There is no need of searching for rooms in person.</li>
<li>	Reduce stress: No worries about the rooms, you get information and vacancies through the app itself.</li>
<li>	Save Energy: Manual presence is not required. You can access it from anywhere.</li>
<li>  Flexibility: No time limitations, 24/7 access.
  </ul>
Team Members:
<ol>
  <li>	Vijaya Raja Mayuri, Akula </li>
<li>	Bhavani ,Pathuri </li>
<li>	Farheen,Mohammad </li>
<li>	Satish,Hiru Gadge </li>
  </ol>
Contributions:
<li>
 
 Activities Involved:
Home Page: Home page consists of app logo and a button "Get Started" which directs to the login activity.

Login Activity: After the home,we come across login and new users can register with application regarding room information and if the registered user forgets the password  he/she can click the “forgot password” redirecting to another activity  where user can reset password by entering recovery “Email ID” and by clicking the “Reset Password” the link is send to respective email ID.Then,after resetting the password we can go back to login page.The credentials for the Login activity can be stored in the firebase.Some tests credentials for the login page is-(mail=avrmayuri741@gmail.com,Password=12345678)or you can register and enter your own credentials

Registration page:The registration activity is directed by clicking "create account"textview and user can register by entering the full name,email,password,phone and can register.The user once registered can go back and login with the given credentials

Owner Login:The Owner of the page can login by clicking the owner login button and enter the credentials.As the owner is the only 4 users and the credentials are fixed and predefined UserName:Admin Password:123456.If the user enters the wrong password it shows the number of attemps left.
After Logging in the user can select the type of the room and type of the share and any specifications and all the information is stored in the firebase with all the information they selected is stored in the collection sample.
The firebase database consists of two databases sample and tenants where sample is for the users and tenants is for the people who are already staying in the apartment.



 
 ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/1.PNG)
 
 
  ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/2.PNG)
  
  
   ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/3.PNG)
   
   
   ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/4.PNG)
 


 ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/5.PNG)


 ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/6.PNG)
 
 
  ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/7.PNG)
  
 
 




By selecting the shared room in the above tabbed activity another activity called “Shared Room” Is opened as below :

![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/8.PNG)
![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/9.PNG)
 ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/10.PNG)
   


By selecting the Private Room the tabbed activity named “Private Room” is opened which consists of Single, Double and other specification

   ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/12.PNG)

By applying to other another activity named “other” is opened where user can give their preferences and specifications. This data is taken and the suitable rooms are searched accordingly.



   ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/13.PNG)


The feedback page is opened after every activity’s final click of “Apply” is clicked. For more queries the user can contact to specified email id.


   ![ favorite image.](https://github.com/Vijayarajamayuri/RoomHunt/blob/master/11.PNG)


Database Requirements:
For this project we are using firebase a cloud storing database which stores all information reagarding the users and tenants and it also reterives the data which is stored in the database regarding the room information.
  
