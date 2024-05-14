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

The React project has the following structure <br> <br>
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/4db7688d-ed91-4c9f-952f-e4d62dfbf94f)

<br>
The important components for this practice are the application itself and the file that contains the tests

- App.js for the source code of the page      ( 🟦 file ) 
- tests.spec.js for the Playwright tests      ( 2º🟩 file ) 

For the project to function, we first need to install the project dependencies using the following command:
```
    npm install
```
> ![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/e2677343-8266-42dd-b31e-a79b089af17e)

<br>
<br>

After that, we can deploy the application using npm:

>[!TIP]\
> The project's README contains all the information of the commands to deploy the application using different methods. <br>

![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/bcd7cc87-82eb-49b1-9fe5-236e91299ed8) <br>
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/6ac9bf3b-19c7-44be-844e-de6fee774a2c) <br>

At this point, the application has been deployed and is running on our machine on port 3000 (in this case):

![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/014117ef-0ccf-4b73-8f6d-10d6ffeaa8ce)
<br>
<br>
Next, we need to install the Playwright dependencies, which consist of several light browsers, among other things.
```
    npx playwright install
```

Now we can run the Playwright tests using the console or by executing the test file. <br>
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/e3807b24-bc7c-4eec-b88e-cd366c5ee474) <br>
<br>
<br>
In addition, Playwright generates a test report
<br>
![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/588ffe26-f011-4841-a44a-a7715b898de4)
> You can find it in the playwright-report directory.
___
If we take a look at the tests, we have two main cases:

![imagen](https://github.com/DanielColado/softwareEngineering/assets/150476751/af20bcaf-41e3-4fba-87d1-42de33686074) <br>
Both are asynchronous functions that use the Playwright library:

- Has title: This function checks the page title and searches for the word 'React'.
  ```js
        test('has title', async ({ page }) => {
            // Establishconnection with the page.
            await page.goto('http://localhost:3000/');
  
            // Expect a title "to contain" a substring.
            await expect(page).toHaveTitle(/React/);
        });
  ```
- Get uah img: same operation but now we are looking for an image resource with the name 'uahlogo'.
  ```js
      test('get uah img', async ({ page }) => {
            await page.goto('http://localhost:3000/');
            // Expect "to contain" an img.
            await page.getByRole('img', { name: 'uahlogo' });
              });
  ```

Both tests pass successfully, but if that were not the case, Playwright provides error information in its report.









