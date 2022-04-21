package com.example.testmodule.TestModuleApi;

public class GetTestByTestResponse {
    public Data data;
    public int total;
    public int page;
    public int limit;
    public int totalPages;

    public GetTestByTestResponse(Data data, int total, int page, int limit, int totalPages) {
        this.data = data;
        this.total = total;
        this.page = page;
        this.limit = limit;
        this.totalPages = totalPages;
    }

    public Data getData() {
        return data;
    }

    public int getTotal() {
        return total;
    }

    public int getPage() {
        return page;
    }

    public int getLimit() {
        return limit;
    }

    public int getTotalPages() {
        return totalPages;
    }
}





