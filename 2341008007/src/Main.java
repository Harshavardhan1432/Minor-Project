public class Main {
    public static void main(String[] args) {
        Member[] member = {
                new Member(118, "McKenzie", "Melissa", 30, 'F', "", "Junior", 153, 963270, new Date(28, "May", 2005)),
                new Member(138, "Stone", "Micheal", 30, 'M', "", "Senior", 0, 983223, new Date(31, "May", 2005)),
                new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 0, 442649, new Date(12, "August", 2006)),
                new Member(176, "Branch", "Helen", 0, 'F', "", "Social", 0, 589419, new Date(6, "December", 2011)),
                new Member(178, "Beck", "Sarah", 0, 'F', "", "Social", 0, 226596, new Date(24, "January", 2010)),
                new Member(228, "Burton", "Sandra", 26, 'F', "", "Junior", 153, 244493, new Date(9, "July", 2013)),
                new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954, new Date(5, "March", 2008)),
                new Member(239, "Spence", "Thomas", 10, 'M', "", "Senior", 0, 697720, new Date(22, "June", 2006)),
                new Member(258, "Olson", "Barbara", 16, 'F', "", "Senior", 0, 370186, new Date(19, "July", 2013)),
                new Member(286, "Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235, 617681, new Date(13, "August", 2013)),
                new Member(290, "Sexton", "Thomas", 26, 'M', "", "Senior", 235, 268936, new Date(28, "July", 2008)),
                new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 0, 665393, new Date(18, "May", 2009)),
                new Member(331, "Schmidt", "Thomas", 25, 'M', "", "Senior", 153, 867492, new Date(7, "April", 2009)),
                new Member(332, "Bridges", "Deborah", 12, 'F', "", "Senior", 235, 279087, new Date(23, "March", 2007)),
                new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", 0, 507813, new Date(17, "April", 2009)),
                new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558, new Date(30, "May", 2007)),
                new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353, new Date(27, "November", 2007)),
                new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664, new Date(5, "August", 2005)),
                new Member(469, "Willis", "Carolyn", 29, 'F', "", "Junior", 0, 688378, new Date(14, "January", 2011)),
                new Member(487, "Kent", "Susan", 0, 'F', "", "Social", 0, 707217, new Date(7, "October", 2010))
        };


        // To display all members
        System.out.println("\nAll Members:");
        for (Member Member : member) {
            Member.display();
        }

        //  To display Members, joined before 07-Apr-09
        System.out.println("\nMembers joined before 07-Apr-09:");
        Date newDate = new Date(7, "April", 2009);

        for (Member Member : member) {
            if (Member.getJoinDate().isBefore(newDate)) {
                Member.display();
            }
        }

        //  To display the Senior members with handicap less than 12:
        System.out.println("\nSenior members with handicap less than 12:");
        for (Member Member : member) {
            if (Member.getMemberType().equalsIgnoreCase("Senior") &&
                    Member.getHandicap() < 12) {
                Member.display();
            }
        }

        //  To display Female senior members in Team B
        System.out.println("\nFemale senior members in Team B:");
        for (Member Member : member) {
            if (Member.getMemberType().equalsIgnoreCase("Senior") &&
                    Member.getGender() == 'F' && Member.getTeam().equalsIgnoreCase("TeamB")) {
                Member.display();
            }
        }
    }
}
