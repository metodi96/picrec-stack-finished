package com.example.picrecstack;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class FeedbackFragment extends Fragment {

    private DatabaseReference databaseReference;
    private FirebaseDatabase firebaseDatabase;
    private RadioButton gender;
    private String genderChoice;

    private RadioButton ageGroup;
    private String ageGroupChoice;
    private RadioButton attractiveImages;
    private String attractiveImagesChoice;
    private RadioButton generatedProfileMatchedChoices;
    private String generatedProfileMatchedChoicesChoice;
    private RadioButton swipingEnjoy;
    private String swipingEnjoyChoice;
    private RadioButton buttonsEnjoy;
    private String buttonsEnjoyChoice;
    private RadioButton swipingPrefer;
    private String swipingPreferChoice;
    private RadioButton easyToTell;
    private String easyToTellChoice;
    private RadioButton attractiveLayout;
    private String attractiveLayoutChoice;
    private RadioButton adequateLayout;
    private String adequateLayoutChoice;
    private RadioButton familiarWithSystem;
    private String familiarWithSystemChoice;
    private RadioButton inControl;
    private String inControlChoice;
    private RadioButton satisfaction;
    private String satisfactionChoice;
    private RadioButton useInTheFuture;
    private String useInTheFutureChoice;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_feedback, container, false);
        final ScrollView scrollView = v.findViewById(R.id.scrollView);
        final EditText previousRecommenders = v.findViewById(R.id.previous_recommenders);
        previousRecommenders.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(v);
                }
            }
        });
        final RadioGroup genderGroup = v.findViewById(R.id.gender_group);
        genderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                gender = genderGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.gender_male:
                        genderChoice = gender.getText().toString();
                        break;
                    case R.id.gender_female:
                        genderChoice = gender.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup ageGroupGroup = v.findViewById(R.id.agegroup_group);
        ageGroupGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                ageGroup = ageGroupGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_agegroup:
                        ageGroupChoice = ageGroup.getText().toString();
                        break;
                    case R.id.second_agegroup:
                        ageGroupChoice = ageGroup.getText().toString();
                        break;
                    case R.id.third_agegroup:
                        ageGroupChoice = ageGroup.getText().toString();
                        break;
                    case R.id.fourth_agegroup:
                        ageGroupChoice = ageGroup.getText().toString();
                        break;
                    case R.id.fifth_agegroup:
                        ageGroupChoice = ageGroup.getText().toString();
                        break;
                    case R.id.sixth_agegroup:
                        ageGroupChoice = ageGroup.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup attractiveImagesGroup = v.findViewById(R.id.attractive_images_group);
        attractiveImagesGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                attractiveImages = attractiveImagesGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_attractive_images:
                        attractiveImagesChoice = attractiveImages.getText().toString();
                        break;
                    case R.id.second_attractive_images:
                        attractiveImagesChoice = attractiveImages.getText().toString();
                        break;
                    case R.id.third_attractive_images:
                        attractiveImagesChoice = attractiveImages.getText().toString();
                        break;
                    case R.id.fourth_attractive_images:
                        attractiveImagesChoice = attractiveImages.getText().toString();
                        break;
                    case R.id.fifth_attractive_images:
                        attractiveImagesChoice = attractiveImages.getText().toString();
                        break;
                    case R.id.sixth_attractive_images:
                        attractiveImagesChoice = attractiveImages.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup generatedProfileMatchedChoicesGroup = v.findViewById(R.id.generated_profile_matched_choices_group);
        generatedProfileMatchedChoicesGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                generatedProfileMatchedChoices = generatedProfileMatchedChoicesGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_generated_profile_matched_choices:
                        generatedProfileMatchedChoicesChoice = generatedProfileMatchedChoices.getText().toString();
                        break;
                    case R.id.second_generated_profile_matched_choices:
                        generatedProfileMatchedChoicesChoice = generatedProfileMatchedChoices.getText().toString();
                        break;
                    case R.id.third_generated_profile_matched_choices:
                        generatedProfileMatchedChoicesChoice = generatedProfileMatchedChoices.getText().toString();
                        break;
                    case R.id.fourth_generated_profile_matched_choices:
                        generatedProfileMatchedChoicesChoice = generatedProfileMatchedChoices.getText().toString();
                        break;
                    case R.id.fifth_generated_profile_matched_choices:
                        generatedProfileMatchedChoicesChoice = generatedProfileMatchedChoices.getText().toString();
                        break;
                    case R.id.sixth_generated_profile_matched_choices:
                        generatedProfileMatchedChoicesChoice = generatedProfileMatchedChoices.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup swipingEnjoyGroup = v.findViewById(R.id.swiping_enjoy_group);
        swipingEnjoyGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                swipingEnjoy = swipingEnjoyGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_swiping_enjoy:
                        swipingEnjoyChoice = swipingEnjoy.getText().toString();
                        break;
                    case R.id.second_swiping_enjoy:
                        swipingEnjoyChoice = swipingEnjoy.getText().toString();
                        break;
                    case R.id.third_swiping_enjoy:
                        swipingEnjoyChoice = swipingEnjoy.getText().toString();
                        break;
                    case R.id.fourth_swiping_enjoy:
                        swipingEnjoyChoice = swipingEnjoy.getText().toString();
                        break;
                    case R.id.fifth_swiping_enjoy:
                        swipingEnjoyChoice = swipingEnjoy.getText().toString();
                        break;
                    case R.id.sixth_swiping_enjoy:
                        swipingEnjoyChoice = swipingEnjoy.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup buttonsEnjoyGroup = v.findViewById(R.id.swiping_enjoy_group);
        buttonsEnjoyGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                buttonsEnjoy = buttonsEnjoyGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_buttons_enjoy:
                        buttonsEnjoyChoice = buttonsEnjoy.getText().toString();
                        break;
                    case R.id.second_buttons_enjoy:
                        buttonsEnjoyChoice = buttonsEnjoy.getText().toString();
                        break;
                    case R.id.third_buttons_enjoy:
                        buttonsEnjoyChoice = buttonsEnjoy.getText().toString();
                        break;
                    case R.id.fourth_buttons_enjoy:
                        buttonsEnjoyChoice = buttonsEnjoy.getText().toString();
                        break;
                    case R.id.fifth_buttons_enjoy:
                        buttonsEnjoyChoice = buttonsEnjoy.getText().toString();
                        break;
                    case R.id.sixth_buttons_enjoy:
                        buttonsEnjoyChoice = buttonsEnjoy.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup preferSwipingGroup = v.findViewById(R.id.prefer_swiping_group);
        preferSwipingGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                swipingPrefer = preferSwipingGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_prefer_swiping:
                        swipingPreferChoice = swipingPrefer.getText().toString();
                        break;
                    case R.id.second_prefer_swiping:
                        swipingPreferChoice = swipingPrefer.getText().toString();
                        break;
                    case R.id.third_prefer_swiping:
                        swipingPreferChoice = swipingPrefer.getText().toString();
                        break;
                    case R.id.fourth_prefer_swiping:
                        swipingPreferChoice = swipingPrefer.getText().toString();
                        break;
                    case R.id.fifth_prefer_swiping:
                        swipingPreferChoice = swipingPrefer.getText().toString();
                        break;
                    case R.id.sixth_prefer_swiping:
                        swipingPreferChoice = swipingPrefer.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup easyToTellGroup = v.findViewById(R.id.easy_to_tell_group);
        easyToTellGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                easyToTell = easyToTellGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_easy_to_tell:
                        easyToTellChoice = easyToTell.getText().toString();
                        break;
                    case R.id.second_easy_to_tell:
                        easyToTellChoice = easyToTell.getText().toString();
                        break;
                    case R.id.third_easy_to_tell:
                        easyToTellChoice = easyToTell.getText().toString();
                        break;
                    case R.id.fourth_easy_to_tell:
                        easyToTellChoice = easyToTell.getText().toString();
                        break;
                    case R.id.fifth_easy_to_tell:
                        easyToTellChoice = easyToTell.getText().toString();
                        break;
                    case R.id.sixth_easy_to_tell:
                        easyToTellChoice = easyToTell.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup attractiveLayoutGroup = v.findViewById(R.id.attractive_layout_group);
        attractiveLayoutGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                attractiveLayout = attractiveLayoutGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_attractive_layout:
                        attractiveLayoutChoice = attractiveLayout.getText().toString();
                        break;
                    case R.id.second_attractive_layout:
                        attractiveLayoutChoice = attractiveLayout.getText().toString();
                        break;
                    case R.id.third_attractive_layout:
                        attractiveLayoutChoice = attractiveLayout.getText().toString();
                        break;
                    case R.id.fourth_attractive_layout:
                        attractiveLayoutChoice = attractiveLayout.getText().toString();
                        break;
                    case R.id.fifth_attractive_layout:
                        attractiveLayoutChoice = attractiveLayout.getText().toString();
                        break;
                    case R.id.sixth_attractive_layout:
                        attractiveLayoutChoice = attractiveLayout.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup adequateLayoutGroup = v.findViewById(R.id.adequate_layout_group);
        adequateLayoutGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                adequateLayout = adequateLayoutGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_adequate_layout:
                        adequateLayoutChoice = adequateLayout.getText().toString();
                        break;
                    case R.id.second_adequate_layout:
                        adequateLayoutChoice = adequateLayout.getText().toString();
                        break;
                    case R.id.third_adequate_layout:
                        adequateLayoutChoice = adequateLayout.getText().toString();
                        break;
                    case R.id.fourth_adequate_layout:
                        adequateLayoutChoice = adequateLayout.getText().toString();
                        break;
                    case R.id.fifth_adequate_layout:
                        adequateLayoutChoice = adequateLayout.getText().toString();
                        break;
                    case R.id.sixth_adequate_layout:
                        adequateLayoutChoice = adequateLayout.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup familiarWithSystemGroup = v.findViewById(R.id.became_familiar_group);
        familiarWithSystemGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                familiarWithSystem = familiarWithSystemGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_became_familiar:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.second_became_familiar:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.third_became_familiar:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.fourth_became_familiar:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.fifth_became_familiar:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.sixth_became_familiar:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup inControlGroup = v.findViewById(R.id.in_control_group);
        inControlGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                inControl = inControlGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_in_control:
                        inControlChoice = inControl.getText().toString();
                        break;
                    case R.id.second_in_control:
                        inControlChoice = inControl.getText().toString();
                        break;
                    case R.id.third_in_control:
                        inControlChoice = inControl.getText().toString();
                        break;
                    case R.id.fourth_in_control:
                        inControlChoice = inControl.getText().toString();
                        break;
                    case R.id.fifth_in_control:
                        inControlChoice = inControl.getText().toString();
                        break;
                    case R.id.sixth_in_control:
                        inControlChoice = inControl.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup satisfiedGroup = v.findViewById(R.id.satisfied_group);
        satisfiedGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                satisfaction = satisfiedGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_satisfied:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.second_satisfied:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.third_satisfied:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.fourth_satisfied:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.fifth_satisfied:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.sixth_satisfied:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup useInTheFutureGroup = v.findViewById(R.id.use_in_the_future_group);
        useInTheFutureGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                useInTheFuture = useInTheFutureGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_use_in_the_future:
                        useInTheFutureChoice = useInTheFuture.getText().toString();
                        break;
                    case R.id.second_use_in_the_future:
                        useInTheFutureChoice = useInTheFuture.getText().toString();
                        break;
                    case R.id.third_use_in_the_future:
                        useInTheFutureChoice = useInTheFuture.getText().toString();
                        break;
                    case R.id.fourth_use_in_the_future:
                        useInTheFutureChoice = useInTheFuture.getText().toString();
                        break;
                    case R.id.fifth_use_in_the_future:
                        useInTheFutureChoice = useInTheFuture.getText().toString();
                        break;
                    case R.id.sixth_use_in_the_future:
                        useInTheFutureChoice = useInTheFuture.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("METO_FIREBASE");
        Button submit = v.findViewById(R.id.submit_feedback);



        //warnings if the user has left a required field unchecked
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (genderGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, genderGroup);
                }
                else if (ageGroupGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, ageGroupGroup);
                }
                else if (attractiveImagesGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, attractiveImagesGroup);
                }
                else if (generatedProfileMatchedChoicesGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, generatedProfileMatchedChoicesGroup);
                }
                else if (swipingEnjoyGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, swipingEnjoyGroup);
                }
                else if (buttonsEnjoyGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, buttonsEnjoyGroup);
                }
                else if (preferSwipingGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, preferSwipingGroup);
                }
                else if (easyToTellGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, easyToTellGroup);
                }
                else if (attractiveLayoutGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, attractiveLayoutGroup);
                }
                else if (adequateLayoutGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, adequateLayoutGroup);
                }
                else if (familiarWithSystemGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, familiarWithSystemGroup);
                }
                else if (inControlGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, inControlGroup);
                }
                else if (satisfiedGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, satisfiedGroup);
                }
                else if (useInTheFutureGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    focusOnView(scrollView, useInTheFutureGroup);
                }
                else {
                    FeedbackObject feedbackObject = new FeedbackObject(genderChoice, ageGroupChoice, previousRecommenders.getText().toString(),
                            attractiveImagesChoice,
                            generatedProfileMatchedChoicesChoice, swipingEnjoyChoice, buttonsEnjoyChoice, swipingPreferChoice,
                            easyToTellChoice, attractiveLayoutChoice, adequateLayoutChoice,
                            familiarWithSystemChoice, inControlChoice,
                            satisfactionChoice, useInTheFutureChoice);
                    databaseReference.push().setValue(feedbackObject);
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, MainActivity.profileFragment).commit();
                }
            }
        });
        return v;
    }
    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private void focusOnView(final View view, final View view2){
        view.post(new Runnable() {
            @Override
            public void run() {
                view.scrollTo(0, view2.getTop());
            }
        });
    }
}
