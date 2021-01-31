## Testing Go Rest API using ZeroCode

It's super simple with ZeroCode to create test project which can be setup in few minutes to test any REST api.

This project covers testing of Rest API written in GO
Go Rest Api code can be found here at [Go-Rest-Api-using-Gorilla-Mux](https://github.com/BeTheCodeWithYou/go-rest-api/tree/feature/go-rest-gorilla)

Create Test Project

Just run the "mvn archetype" on your project directly

```
mvn archetype:generate \
-DarchetypeGroupId=org.jsmart \
-DarchetypeArtifactId=zerocode-maven-archetype \
-DarchetypeVersion=1.3.20 \
-DgroupId=com.go \
-DartifactId=my-go-api-tests \
-Dversion=1.0.0-SNAPSHOT

```
Above code will genreate ready to use project with sample Tests for GET, POST, PUT api calls.

You just have to edit the tests located under resources/tests  s as per your API and hostconfig files in the resouce folder to specify host and port where your API is running.

Once all setup, just run below command

```
mvn clean install
```
This will run all the test cases.
OR
You can also run any individual tests directly from IDE.

<details><summary>Click for Demo </summary>

![Go-API-Test-using-ZeroCode](/go-api-test.gif)

</details>
