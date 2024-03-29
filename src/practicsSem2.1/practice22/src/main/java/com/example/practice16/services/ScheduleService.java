package com.example.practice16.services;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleService {

    private List<String> resultSetArray = new ArrayList<>();

    public static void printToCsv(List<String> resultArray, String path) throws Exception {

        File csvOutputFile = new File(path);
        FileWriter fileWriter = new FileWriter(csvOutputFile, false);


        for (String mapping : resultArray) {
            fileWriter.write(mapping + "\n");
        }

        fileWriter.close();

    }

    //@Scheduled(cron = "0 * * * * *")
    @Scheduled(fixedRate = 10000)
    public void scheduleFixedDelayTask() throws Exception {
        System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);

        FileUtils.cleanDirectory(new File("src/main/Tests"));

        String url = "jdbc:postgresql://localhost:5432/practice15";
        String password = "0813526";
        String username = "postgres";

        Connection connection = DriverManager.getConnection(url, username, password);

        fetchDataFromDatabase("SELECT * FROM author", connection);
        String csvFilePathForStudent = "src/main/Tests/1.csv";
        printToCsv(resultSetArray, csvFilePathForStudent);

        fetchDataFromDatabase("SELECT * FROM book", connection);
        String csvFilePathForDog = "src/main/Tests/2.csv";
        printToCsv(resultSetArray, csvFilePathForDog);

    }

    private void fetchDataFromDatabase(String selectQuery, Connection connection) throws Exception {
        try {


            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            int numCols = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                StringBuilder sb = new StringBuilder();

                for (int i = 1; i <= numCols; i++) {
                    sb.append(String.format(String.valueOf(rs.getString(i))) + " ");

                }
                resultSetArray.add(sb.toString());

            }

        } catch (SQLException e) {
            System.out.println("Sql exception " + e.getMessage());
        }

    }


}
