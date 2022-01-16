package com.example.task2.operations.operations_with_lists;

import com.example.task2.VariableStorage.*;
import com.example.task2.operations.main_operations.Operation;

import java.util.List;

public class SearchInList extends Operation {

    public SearchInList(List list, DefOperationTags operationTag) {
        super(list);
        key = operationTag;
    }

    @Override
    public void operation(Object collection) {
        ((List)collection).contains("123");
    }
}