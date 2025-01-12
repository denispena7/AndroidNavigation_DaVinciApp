package es.studium.davinciapp.ui.sculptures;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SculpturesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SculpturesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}