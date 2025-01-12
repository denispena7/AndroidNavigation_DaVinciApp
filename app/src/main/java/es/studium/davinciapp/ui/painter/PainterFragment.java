package es.studium.davinciapp.ui.painter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import es.studium.davinciapp.databinding.FragmentPainterBinding;

public class PainterFragment extends Fragment
{
    private FragmentPainterBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PainterViewModel painterViewModel =
                new ViewModelProvider(this).get(PainterViewModel.class);

        binding = FragmentPainterBinding.inflate(inflater, container, false);
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