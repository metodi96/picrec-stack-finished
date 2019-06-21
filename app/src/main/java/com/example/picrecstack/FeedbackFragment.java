package com.example.picrecstack;

import android.app.Activity;
import android.graphics.Color;
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
    private RadioButton generatedProfileMatchChoices;
    private String generatedProfileMatchChoicesChoice;
    private RadioButton choiceImagesAppeal;
    private String choiceImagesAppealChoice;
    private RadioButton manipulatedPicturesEnjoy;
    private String manipulatedPicturesEnjoyChoice;
    private RadioButton allowedLikeDislike;
    private String allowedLikeDislikeChoice;
    private RadioButton happyWithGeneratedProfile;
    private String happyWithGeneratedProfileChoice;
    private RadioButton attractiveLayout;
    private String attractiveLayoutChoice;
    private RadioButton easyToModifyProfile;
    private String easyToModifyProfileChoice;
    private RadioButton familiarWithSystem;
    private String familiarWithSystemChoice;
    private RadioButton inControl;
    private String inControlChoice;
    private RadioButton understoodProfile;
    private String understoodProfileChoice;
    private RadioButton satisfaction;
    private String satisfactionChoice;
    private RadioButton useInTheFuture;
    private String useInTheFutureChoice;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_feedback, container, false);
        final EditText editTextFeedback = v.findViewById(R.id.insert_feedback);
        editTextFeedback.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(v);
                }
            }
        });
        final EditText editTextName = v.findViewById(R.id.insert_name);
        editTextName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
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

        final RadioGroup generatedProfileMatchChoicesGroup = v.findViewById(R.id.generated_profile_match_choices_group);
        generatedProfileMatchChoicesGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                generatedProfileMatchChoices = generatedProfileMatchChoicesGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_generated_profile_match_choices:
                        generatedProfileMatchChoicesChoice = generatedProfileMatchChoices.getText().toString();
                        break;
                    case R.id.second_generated_profile_match_choices:
                        generatedProfileMatchChoicesChoice = generatedProfileMatchChoices.getText().toString();
                        break;
                    case R.id.third_generated_profile_match_choices:
                        generatedProfileMatchChoicesChoice = generatedProfileMatchChoices.getText().toString();
                        break;
                    case R.id.fourth_generated_profile_match_choices:
                        generatedProfileMatchChoicesChoice = generatedProfileMatchChoices.getText().toString();
                        break;
                    case R.id.fifth_generated_profile_match_choices:
                        generatedProfileMatchChoicesChoice = generatedProfileMatchChoices.getText().toString();
                        break;
                    case R.id.sixth_generated_profile_match_choices:
                        generatedProfileMatchChoicesChoice = generatedProfileMatchChoices.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup choiceImagesAppealGroup = v.findViewById(R.id.choice_images_appeal_group);
        choiceImagesAppealGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                choiceImagesAppeal = choiceImagesAppealGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_choice_images_appeal:
                        choiceImagesAppealChoice = choiceImagesAppeal.getText().toString();
                        break;
                    case R.id.second_choice_images_appeal:
                        choiceImagesAppealChoice = choiceImagesAppeal.getText().toString();
                        break;
                    case R.id.third_choice_images_appeal:
                        choiceImagesAppealChoice = choiceImagesAppeal.getText().toString();
                        break;
                    case R.id.fourth_choice_images_appeal:
                        choiceImagesAppealChoice = choiceImagesAppeal.getText().toString();
                        break;
                    case R.id.fifth_choice_images_appeal:
                        choiceImagesAppealChoice = choiceImagesAppeal.getText().toString();
                        break;
                    case R.id.sixth_choice_images_appeal:
                        choiceImagesAppealChoice = choiceImagesAppeal.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup manipulatedPicturesEnjoyGroup = v.findViewById(R.id.manipulated_pictures_enjoy_group);
        manipulatedPicturesEnjoyGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                manipulatedPicturesEnjoy = manipulatedPicturesEnjoyGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_manipulated_pictures_enjoy:
                        manipulatedPicturesEnjoyChoice = manipulatedPicturesEnjoy.getText().toString();
                        break;
                    case R.id.second_manipulated_pictures_enjoy:
                        manipulatedPicturesEnjoyChoice = manipulatedPicturesEnjoy.getText().toString();
                        break;
                    case R.id.third_manipulated_pictures_enjoy:
                        manipulatedPicturesEnjoyChoice = manipulatedPicturesEnjoy.getText().toString();
                        break;
                    case R.id.fourth_manipulated_pictures_enjoy:
                        manipulatedPicturesEnjoyChoice = manipulatedPicturesEnjoy.getText().toString();
                        break;
                    case R.id.fifth_manipulated_pictures_enjoy:
                        manipulatedPicturesEnjoyChoice = manipulatedPicturesEnjoy.getText().toString();
                        break;
                    case R.id.sixth_manipulated_pictures_enjoy:
                        manipulatedPicturesEnjoyChoice = manipulatedPicturesEnjoy.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup allowedLikeDislikeGroup = v.findViewById(R.id.allowed_like_dislike_group);
        allowedLikeDislikeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                allowedLikeDislike = allowedLikeDislikeGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_allowed_like_dislike:
                        allowedLikeDislikeChoice = allowedLikeDislike.getText().toString();
                        break;
                    case R.id.second_allowed_like_dislike:
                        allowedLikeDislikeChoice = allowedLikeDislike.getText().toString();
                        break;
                    case R.id.third_allowed_like_dislike:
                        allowedLikeDislikeChoice = allowedLikeDislike.getText().toString();
                        break;
                    case R.id.fourth_allowed_like_dislike:
                        allowedLikeDislikeChoice = allowedLikeDislike.getText().toString();
                        break;
                    case R.id.fifth_allowed_like_dislike:
                        allowedLikeDislikeChoice = allowedLikeDislike.getText().toString();
                        break;
                    case R.id.sixth_allowed_like_dislike:
                        allowedLikeDislikeChoice = allowedLikeDislike.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup happyWithGeneratedProfileGroup = v.findViewById(R.id.happy_with_generated_profile_group);
        happyWithGeneratedProfileGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                happyWithGeneratedProfile = happyWithGeneratedProfileGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_happy_with_generated_profile:
                        happyWithGeneratedProfileChoice = happyWithGeneratedProfile.getText().toString();
                        break;
                    case R.id.second_happy_with_generated_profile:
                        happyWithGeneratedProfileChoice = happyWithGeneratedProfile.getText().toString();
                        break;
                    case R.id.third_happy_with_generated_profile:
                        happyWithGeneratedProfileChoice = happyWithGeneratedProfile.getText().toString();
                        break;
                    case R.id.fourth_happy_with_generated_profile:
                        happyWithGeneratedProfileChoice = happyWithGeneratedProfile.getText().toString();
                        break;
                    case R.id.fifth_happy_with_generated_profile:
                        happyWithGeneratedProfileChoice = happyWithGeneratedProfile.getText().toString();
                        break;
                    case R.id.sixth_happy_with_generated_profile:
                        happyWithGeneratedProfileChoice = happyWithGeneratedProfile.getText().toString();
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

        final RadioGroup familiarWithSystemGroup = v.findViewById(R.id.familiar_with_system_group);
        familiarWithSystemGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                familiarWithSystem = familiarWithSystemGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_familiar_with_system:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.second_familiar_with_system:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.third_familiar_with_system:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.fourth_familiar_with_system:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.fifth_familiar_with_system:
                        familiarWithSystemChoice = familiarWithSystem.getText().toString();
                        break;
                    case R.id.sixth_familiar_with_system:
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

        final RadioGroup understoodProfileGroup = v.findViewById(R.id.understood_profile_group);
        understoodProfileGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                understoodProfile = understoodProfileGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_understood_profile:
                        understoodProfileChoice = understoodProfile.getText().toString();
                        break;
                    case R.id.second_understood_profile:
                        understoodProfileChoice = understoodProfile.getText().toString();
                        break;
                    case R.id.third_understood_profile:
                        understoodProfileChoice = understoodProfile.getText().toString();
                        break;
                    case R.id.fourth_understood_profile:
                        understoodProfileChoice = understoodProfile.getText().toString();
                        break;
                    case R.id.fifth_understood_profile:
                        understoodProfileChoice = understoodProfile.getText().toString();
                        break;
                    case R.id.understood_profile_group:
                        understoodProfileChoice = understoodProfile.getText().toString();
                        break;
                    default: break;
                }
            }
        });

        final RadioGroup satisfactionGroup = v.findViewById(R.id.satisfaction_group);
        satisfactionGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                satisfaction = satisfactionGroup.findViewById(checkedId);

                switch (checkedId) {
                    case R.id.first_satisfaction:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.second_satisfaction:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.third_satisfaction:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.fourth_satisfaction:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.fifth_satisfaction:
                        satisfactionChoice = satisfaction.getText().toString();
                        break;
                    case R.id.sixth_satisfaction:
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



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String feedback = editTextFeedback.getText().toString();
                if (genderGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    genderGroup.getParent().requestChildFocus(genderGroup, genderGroup);
                }
                if (ageGroupGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    ageGroupGroup.getParent().requestChildFocus(ageGroupGroup, ageGroupGroup);
                }
                if (generatedProfileMatchChoicesGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    generatedProfileMatchChoicesGroup.getParent().requestChildFocus(generatedProfileMatchChoicesGroup, generatedProfileMatchChoicesGroup);
                }
                if (choiceImagesAppealGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    choiceImagesAppealGroup.getParent().requestChildFocus(choiceImagesAppealGroup, choiceImagesAppealGroup);
                }
                if (manipulatedPicturesEnjoyGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    manipulatedPicturesEnjoyGroup.getParent().requestChildFocus(manipulatedPicturesEnjoyGroup, manipulatedPicturesEnjoyGroup);
                } if (allowedLikeDislikeGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    allowedLikeDislikeGroup.getParent().requestChildFocus(allowedLikeDislikeGroup, allowedLikeDislikeGroup);
                }
                if (happyWithGeneratedProfileGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    happyWithGeneratedProfileGroup.getParent().requestChildFocus(happyWithGeneratedProfileGroup, happyWithGeneratedProfileGroup);
                }
                if (attractiveLayoutGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    attractiveLayoutGroup.getParent().requestChildFocus(attractiveLayoutGroup, attractiveLayoutGroup);
                }
                if (familiarWithSystemGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    familiarWithSystemGroup.getParent().requestChildFocus(familiarWithSystemGroup, familiarWithSystemGroup);
                } if (inControlGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    inControlGroup.getParent().requestChildFocus(inControlGroup, inControlGroup);
                }
                if (understoodProfileGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    understoodProfileGroup.getParent().requestChildFocus(understoodProfileGroup, understoodProfileGroup);
                }
                if (satisfactionGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    satisfactionGroup.getParent().requestChildFocus(satisfactionGroup, satisfactionGroup);
                } if (useInTheFutureGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getContext(), "Please select at least one of the options", Toast.LENGTH_SHORT).show();
                    useInTheFutureGroup.getParent().requestChildFocus(useInTheFutureGroup, useInTheFutureGroup);
                }
                else {
                    FeedbackObject feedbackObject = new FeedbackObject(name, feedback, genderChoice, ageGroupChoice,
                            generatedProfileMatchChoicesChoice, choiceImagesAppealChoice, manipulatedPicturesEnjoyChoice,
                            allowedLikeDislikeChoice, happyWithGeneratedProfileChoice, attractiveLayoutChoice, familiarWithSystemChoice, inControlChoice, understoodProfileChoice,
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
}
