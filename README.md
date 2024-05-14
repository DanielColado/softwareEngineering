# software Engineering
UAH repo for Software Engineering 

### :atom: Project members:
- Daniel Eduardo Allo Franco 
- Daniel Colado Antona
- Alexandra María Raileanu
___

### Assignment 1: DOCUMENTATION 📓
The final SRS file is on **documentation/SRS.pdf** 
<br>
<br>
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/60ddfc3d-c20b-4e5b-8a4b-172268d5dc4f)
<br>
> [!NOTE]\
> This is the same document delivered in the first practice.     <br>
> It compiles all the requirements of the Dental Clinic.

We used the VSC ( visual studio code ) extension **draw.io** for the diferents diagrams. <br>
Extension id: hediet.vscode-drawio <br><br>
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/41dca177-3902-4552-b290-4334c706c3fc)




The other directory ( SRS util ) contenins the images and other unfinished versions of the SRS. <br>
The SRS release contais the SRS commit used for the submision.

___
### Assignment 2: TESTING 🧪
For the second assignment, everything is located within the directory "/testing," which has 2 subdirectories.
<br>
<br>
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/dc95f959-ff2e-4c17-bc59-8c3ed87088d2)   


- **/testingProject** is the maven project with the jUnit tests and Mockito test
- **/Playwright tests/testing-project** contains the React app and the Playwright testing


#### /testingProject
This project contains 3 jUnit tests and a mockito test for the class MathFunctions <br>

![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/e9a2cf36-fa41-4e1e-b1cb-559a5d38e0ee)

The project has 2 main directories:
- **/src/main/java/source** for the source code       ( 🟦 directory ) 
- **/test/java/source** for the jUnit and other tests ( 🟩 directory )

Dependencies:
- The JDK used is the  **JDK 21** 
- All the jUnit dependencies are already set, the project should use it automaticly

All tests can be executed by running the tests source directory. 
<br>
<br>
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/5ccc91c1-5774-4ce4-a834-880dbdbb8e73)
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/5c8efbd1-a00f-45f2-acd5-28237e1fa675)
<br>

And the output should be: 
<br>
<br>
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/b6a240b5-0860-4971-9949-c60dfd607458)
<br>
All tests pass successfully.

___

#### /Playwright tests/testing-project

In the case of the Playwright tests, we have deployed an application using React and the Playwright framework itself.

- React
    ```
    https://github.com/facebook/create-react-app
  ```
- Playwright
  ``` 
    npm init playwright@latest
  ```
We have used NodeJS for dependency and package management

- NodeJS
  ```
    https://nodejs.org/en
  ```



