package com.example.testmodule;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.testmodule.TestModuleApi.ApiClient;
import com.example.testmodule.TestModuleApi.FetchQuestionByTestResponse;
import com.example.testmodule.TestModuleApi.GetAllTestForStudentResponse;
import com.example.testmodule.TestModuleApi.GetChapterTestResponse;
import com.example.testmodule.TestModuleApi.GetStudentSolutionResponse;
import com.example.testmodule.TestModuleApi.GetSyllabuswiseTestResponse;
import com.example.testmodule.TestModuleApi.GetTestByTestResponse;
import com.example.testmodule.TestModuleApi.Item;
import com.example.testmodule.TestModuleApi.LogInService;
import com.example.testmodule.TestModuleApi.Subject;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    Retrofit retrofit;
    LogInService logInService;
    NavController navController;

    GetAllTestForStudentResponse getAllTestForStudentResponse;
    GetSyllabuswiseTestResponse getSyllabuswiseTestResponse;
    List<GetChapterTestResponse> getChapterTestResponse;
    GetTestByTestResponse getTestByTestResponse;
    FetchQuestionByTestResponse fetchQuestionByTestResponse;
    GetStudentSolutionResponse getStudentSolutionResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        apiInIt();
        getAllStudTest();
        getSyllabusWiseTest();
        getChapterTest();
        getTestByTest();
        fetchQueByTest();
        getstudSolution();
    }

    public  void apiInIt()
    {
        retrofit = ApiClient.getRetrofit();
        logInService = ApiClient.getLoginService();

    }
    public void getAllStudTest()
    {
        Call<GetAllTestForStudentResponse> call=logInService.getAllTestStudCall();
        call.enqueue(new Callback<GetAllTestForStudentResponse>() {
            @Override
            public void onResponse(Call<GetAllTestForStudentResponse> call, Response<GetAllTestForStudentResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getAllTestForStudentResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(getAllTestForStudentResponse.testsAvailable), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetAllTestForStudentResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error get all tests", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getSyllabusWiseTest()
    {
        Call<GetSyllabuswiseTestResponse> call=logInService.getSyllabusTestCall("Full Test");
        call.enqueue(new Callback<GetSyllabuswiseTestResponse>() {
            @Override
            public void onResponse(Call<GetSyllabuswiseTestResponse> call, Response<GetSyllabuswiseTestResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getSyllabuswiseTestResponse=response.body();
                Subject response1=getSyllabuswiseTestResponse.subjects.get(0);
                Toast.makeText(getApplicationContext(), String.valueOf(response1.subjectName), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetSyllabuswiseTestResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error syllabus test", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getChapterTest()
    {
        Call<List<GetChapterTestResponse>> call=logInService.getChapterTestCall(267);
        call.enqueue(new Callback<List<GetChapterTestResponse>>() {
            @Override
            public void onResponse(Call<List<GetChapterTestResponse>> call, Response<List<GetChapterTestResponse>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getChapterTestResponse=response.body();
                GetChapterTestResponse response1=getChapterTestResponse.get(0);
                Toast.makeText(getApplicationContext(), String.valueOf(response1.chapterName), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<GetChapterTestResponse>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error get chapter", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getTestByTest()
    {
        Call<GetTestByTestResponse> call=logInService.getTestByTestCall("AVAILABLE","Part Test",true,12);
        call.enqueue(new Callback<GetTestByTestResponse>() {
            @Override
            public void onResponse(Call<GetTestByTestResponse> call, Response<GetTestByTestResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getTestByTestResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(getTestByTestResponse.limit), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetTestByTestResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error test by test", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void fetchQueByTest()
    {
        Call<FetchQuestionByTestResponse> call=logInService.fetchTestByQueCall(3);
        call.enqueue(new Callback<FetchQuestionByTestResponse>() {
            @Override
            public void onResponse(Call<FetchQuestionByTestResponse> call, Response<FetchQuestionByTestResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                fetchQuestionByTestResponse=response.body();
                Toast.makeText(getApplicationContext(), String.valueOf(fetchQuestionByTestResponse.question.statement), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<FetchQuestionByTestResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error in fetch question", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void getstudSolution()
    {
        Call<GetStudentSolutionResponse> call=logInService.studSolutionCall(701,1);
        call.enqueue(new Callback<GetStudentSolutionResponse>() {
            @Override
            public void onResponse(Call<GetStudentSolutionResponse> call, Response<GetStudentSolutionResponse> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                getStudentSolutionResponse=response.body();
                Item response1=getStudentSolutionResponse.items.get(0);
                Toast.makeText(getApplicationContext(), String.valueOf(response1.solution), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetStudentSolutionResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "error student solution", Toast.LENGTH_SHORT).show();
            }
        });
    }

}