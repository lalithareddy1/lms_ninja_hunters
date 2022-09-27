@registration
Feature: Validating text fields on the registration page

Background:
    Given User is on Registration page
    
Scenario: User fills the First Name field
When User fills the 'First Name' in Alphabets only
| FirstName | John |
Then 'First Name' will be displayed

Scenario: User fills the Last Name field
When User fills the 'Last Name' in Alphabets only
| LastName | Kenny |
Then 'Last Name' will be displayed

Scenario: User fills the Address field
When User fills the 'Address Field' using Alpha Numerics and or Symbols
| Address | 5Talbot Street |
Then 'Address' will be displayed

Scenario: User fills the Street Name field
When User fills the 'Street Name' Field using Alpha Numerics and or Symbols
| StreetName | 5Talbot Street |
Then 'Street Name' will be displayed

Scenario: User fills the City Name field
When User fills the 'City Name' in Alphabets only
| City | Torrance |
Then 'City Name' will be displayed

Scenario: User selects the State field
When User selects the respective State Name from the DropBox
| State | Connecticut |
Then 'State Name' will be displayed

Scenario: User fills the Zip field
When User fills the 5 digit zip code using Numbers only
| zip | 90505 |
Then 'Zip Code' will be displayed

Scenario: User selects the Birth Date
When User selects Date of Birth from the calender
| BirthDate | 04/20/1990 |
Then 'Birth Date' will be displayed

Scenario: User fills the UserName
When User fills the valid unique UserName
| uniqueName | someName@123 |
Then 'UserName' will be displayed

Scenario: User fills the Phone Number
When User fills the valid 10 digit Mobile Number in Numerics
| PhoneNum | 8739127492 |
Then 'Mobile Number' will be displayed

Scenario: User fills the Email
When User fills the valid Email
| Email | John@gmail.com |
Then 'Email' will be displayed

Scenario: User fills the Password
When User fills the valid password with 1 upper case, 1 Numeric and 1 special character and 8 characters
| Password | Testing@1 |
Then 'UserPassword' will be displayed

Scenario: Validating the sign Up form with all fields empty
When User enters submit button with all fields empty
Then User should get a message 'Please fill all fields above'

Scenario: Validating the First Name field on Registration Page
When User click Sign Up button with invalid 'First Name'
Then User should get a message 'Please fill valid First Name'

Scenario: Validating the Last Name field on Registration Page
When User click Sign Up button with invalid 'Last Name'
Then User should get a message 'Please fill valid Last Name'

Scenario: Validating the Address field on Registration Page
When User click Sign Up button with invalid 'Address'
Then User should get a message 'Please fill valid Address'

Scenario: Validating the Zip field on Registration Page
When User click Sign Up button with invalid 'Zip'
Then User should get a message 'Please fill valid Zip'

Scenario: Validating the City field on Registration Page
When User click Sign Up button with invalid 'City' 
Then User should get a message 'Please fill valid City'

Scenario: Validating the State field on Registration Page
When User click Sign Up button with invalid 'State' 
Then User should get a message 'Please fill valid State'

Scenario: Validating the Phone Number field on Registration Page
When User click Sign Up button with invalid 'Phone Number' 
Then User should get a message 'Please fill valid Phone Number'

Scenario: Validating the BirthDate field on Registration Page
When User click Sign Up button without selecting BirthDate 
Then User should get a message 'Please select BirthDate'

Scenario: Validating the UserName field on Registration Page
When User click Sign Up button with invalid 'UserName' 
Then User should get a message 'Please fill valid UserName'

Scenario: Validating the email field on Registration Page
When User click Sign Up button with invalid 'Email'
Then User should get a message 'Please fill valid Email'

Scenario: Validating the Password field on Registration Page
When User click Sign Up button with invalid 'Password'
Then User should get a message 'Please fill valid Password'

Scenario: Validating the signup form with existing username
When User click Sign Up button with existing userName 
Then User should get a message 'Username already exists'

Scenario: Validating the signup form with valid data
When User enters all field value and click 'Sign Up' button
Then User should get a message 'Registration Successfull'




