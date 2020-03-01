package com.example.viq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    EditText input;
    TextView answer;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View firstFragmentLayout = inflater.inflate(R.layout.fragment_first, container, false);
        input = firstFragmentLayout.findViewById(R.id.edittext_input);
        answer = firstFragmentLayout.findViewById(R.id.textview_answer);
        return firstFragmentLayout;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(view);
            }
        });
    }

    private void sendMessage(View view) {
        String userInput = input.getText().toString();
        int padding = getResources().getDimensionPixelOffset(R.dimen.padding);
        answer.setPadding(padding, padding, padding, padding);
        answer.setText(userInput);
        input.setText("");
    }
}
