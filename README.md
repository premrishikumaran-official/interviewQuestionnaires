# interviewQuestionnaire

Problem Statement
Getting the best tutors is key to delivering quality lessons to our students. In order to ensure
we pick the best candidates to work at MyTutor we have an onboarding process that ranks
tutors. In this example we are scoring tutors based on a questionnaire. All tutors currently
receive the same questions and when they submit their answers we generate a score. This
score is later used to determine whether we allow them to teach on our platform. The
questionnaire and scoring looks like this (scoring is not shared with tutors):
[Multiple selection allowed] What kind of tutoring experience do you have?
1. Online tutoring (Score 1 point)
2. Home schooling (Score 1 point)
3. After school club (Score 1 point)
4. None (Score 0 points)
   
[Single choice allowed] How much overall tutoring experience do you have?
1. 0-1 years (Score 0 points)
2. 1-2 years (Score 1 points)
3. 3 or more (Score 2 points)
4. None (Score 0 points)
   
Requirements
We would like you to write code such that:
Given a tutor questionnaire is passed for a tutor identified by tutor id then a score is
generated and returned with a record of the original submission
Given a tutor has selected multiple options in the multiple choice question then the
sum of points for each choice are added to their score
Given a tutor has selected one of the options for the single choice question then only
the points associated with that choice are added to their score
Given a tutor has answered both questions then their score is the sum of their points
for both questions
