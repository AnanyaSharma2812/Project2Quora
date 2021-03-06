package com.example.questionsAndAnswersMicroservice.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(value="Questions")
@Getter
@Setter
@ToString
public class Questions
{

    @Id
    private String questionId="";
    private String questionValue="";
    private Boolean questionStatus=false;

    private String categoryId="";
    private String categoryName="";

    private Date date=new Date();

    private String askerProfileId="";
    private String askerProfileName="";

    private String profileWhereAskedId="";
    private String profileWhereAskedName="";
    private String profileWhereAskedType="";

    private int numberOfLikes=0;
    private List<String> likeProfileIdList=new ArrayList<>();

    private int numberOfDislikes=0;
    private List<String> dislikeProfileIdList=new ArrayList<>();

    private List<String> emojisValue=new ArrayList<>();
    private List<String> emojisProfileIdList=new ArrayList<>();

    private Boolean isThreadOpen;

    private List<String> answerIdList=new ArrayList<>();

    private String approvedAnswerId="";
    private String approvedAnswer="";
    private String approvedAnswererId="";
    private String approvedAnswererProfile="";
}
