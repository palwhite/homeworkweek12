package uk.co.library.resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "LoginData")
    public Object[][] createData1() {

        return new Object[][] {
                { "Tester", "Harrow", "5 miles", "30000", "500000" , "Per annum","Permanent", "Permanent Tester jobs in Harrow"},
                { "web designer developer", "London Colney Hertfordshire", "10 miles", "35000", "500000" , "Per month","Permanent","Permanent Web Designer Developer jobs"},
                { "Application Developer", "Wembley", "7 miles", "8800", "1000" , "Per week","Contract", "Contract Application Developer jobs in Wembley"},
                { "Tester", "Kingsbury", "100 miles", "30000", "500000" , "Per annum","Part Time","Part Time Tester jobs in Kingsbury"},
                { "Tester", "Hatfield", "750 miles", "250", "300" , "Per day","Temporary","Temporary Tester jobs in Hatfield"},
                { "Dev ops", "Watford", "5 miles", "60000", "800000" , "Per annum","Apprenticeship","Apprenticeship Devops jobs in Watford"},
                { "Data Analyst", "Leicester", "7 miles", "15", "20" , "Per hour","Part Time","Part Time Data Analyst jobs in Leicester"},

        };
    }
}
