package es.studium.davinciapp.ui.sculptures;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import es.studium.davinciapp.databinding.FragmentSculpturesBinding;

public class SculpturesFragment extends Fragment {

    private FragmentSculpturesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SculpturesViewModel sculpturesViewModel =
                new ViewModelProvider(this).get(SculpturesViewModel.class);

        binding = FragmentSculpturesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }
}