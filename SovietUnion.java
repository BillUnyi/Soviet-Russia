import java.awt.*;
import java.util.Random;

public class SovietUnion {

    private Russian russians[];
    private Color skinColors[];
    private Color hairColors[];
    private Color clothingColors[];
    private String branches[];
    private String ranks[][];
    private String maleNames[];
    private String femaleNames[];
    private String lastNames[];
    private Color background;
    private int numRussians;
    private int numSoldiers;

    public SovietUnion(int nr, int ns, Graphics2D g) {

        this.numRussians = nr;
        this.numSoldiers = ns;
        this.background = new Color(40, 40, 40);
        this.russians = new Russian [numRussians + numSoldiers + 1];
        setSkinColors();
        setHairColors();
        setClothingColors();
        setRanks();
        setBranches();
        setMaleNames();
        setFemaleNames();
        setLastNames();

        Random random = new Random();
        String gender = "";
        for (int i = 0; i < numRussians; i++) {
            gender = createGender();
            russians[i] = new Russian(random.nextInt(96) + 5, createFirstName(gender), createLastName(), createGender(),
                    g, skinColors[random.nextInt(12)], createClothingColor(), createClothingColor(), createHairColor(),
                    random.nextInt(400) + 100, random.nextInt(230) + 300);
        }
        Color uniformColor = new Color(59, 119, 58);
        String branch = "";
        String rank = "";
        int age;
        int counter = 0;
        int coloumn = 0;
        for (int i = 0; i < numSoldiers; i++) {
            gender = createGender();
            branch = createBranch();
            rank = createRank(branch);
            age = random.nextInt(33) + 18;
            russians[i + numRussians] = new Soldier(age, createFirstName(gender), createLastName(), gender, g, skinColors[random.nextInt(12)], uniformColor, createHairColor(), 700 + 25 * counter + 12 * (coloumn % 2), 320 + 50 * coloumn, rank,
                    branch, random.nextInt(age - 17));
            counter++;
            if (counter >= 10) {
                counter = 0;
                coloumn++;
            }
        }
        Color generalColor = new Color(245, 245, 220);
        gender = createGender();
        age = random.nextInt(41) + 40;
        russians[russians.length - 1] = new General(age, createFirstName(gender), createLastName(), gender, g, skinColors[random.nextInt(12)], generalColor, createHairColor(), 819, 240, "Six Star General", createBranch(),
                random.nextInt(age - 27) + 10, random.nextInt(900000) + 100000);
    }

    public void drawSovietUnion(Graphics2D g) {
        g.setColor(background);
        g.fillRect(0, 0, 1920, 1080);
        g.setColor(Color.black);
        drawGrid(g);
        drawRussia(g);
        drawSickle(g);
        drawHammer(g);
        for (int i = 0; i < russians.length; i++) {
            russians[i].drawRussian(g);
        }
    }

    public void textBox(int num, Graphics2D g) {
        g.setColor(Color.darkGray);
        g.fillRect(20, 20, 1035, 15);
        g.setColor(Color.black);
        g.drawRect(20, 20, 1035,  15);
        g.setColor(Color.white);
        Font font = new Font("Font", Font.ITALIC, 8);
        g.setFont(font);
        g.drawString(russians[num].greeting(), 25, 30);
    }

    public void drawRussia(Graphics2D g) {
        g.setColor(Color.red);
        Polygon russia = new Polygon();
        russia.addPoint(100, 340);
        russia.addPoint(120, 340);
        russia.addPoint(150, 300);
        russia.addPoint(170, 300);
        russia.addPoint(180, 350);
        russia.addPoint(260, 355);
        russia.addPoint(270, 375);
        russia.addPoint(275, 335);
        russia.addPoint(395, 325);
        russia.addPoint(530, 290);
        russia.addPoint(600, 290);
        russia.addPoint(590, 320);
        russia.addPoint(710, 310);
        russia.addPoint(730, 270);
        russia.addPoint(770, 250);
        russia.addPoint(830, 240);
        russia.addPoint(850, 170);
        russia.addPoint(920, 110);
        russia.addPoint(930, 130);
        russia.addPoint(915, 150);
        russia.addPoint(925, 165);
        russia.addPoint(945, 165);
        russia.addPoint(960, 250);
        russia.addPoint(955, 280);
        russia.addPoint(965, 300);
        russia.addPoint(985, 305);
        russia.addPoint(1030, 420);
        russia.addPoint(970, 395);
        russia.addPoint(945, 275);
        russia.addPoint(935, 265);
        russia.addPoint(940, 295);
        russia.addPoint(930, 290);
        russia.addPoint(940, 360);
        russia.addPoint(920, 430);
        russia.addPoint(920, 540);
        russia.addPoint(980, 530);
        russia.addPoint(1000, 610);
        russia.addPoint(1000, 700);
        russia.addPoint(975, 705);
        russia.addPoint(960, 690);
        russia.addPoint(970, 680);
        russia.addPoint(950, 620);
        russia.addPoint(935, 640);
        russia.addPoint(885, 635);
        russia.addPoint(820, 610);
        russia.addPoint(795, 620);
        russia.addPoint(795, 680);
        russia.addPoint(725, 705);
        russia.addPoint(635, 695);
        russia.addPoint(550, 715);
        russia.addPoint(425, 640);
        russia.addPoint(325, 635);
        russia.addPoint(295, 675);
        russia.addPoint(105, 625);
        russia.addPoint(100, 665);
        russia.addPoint(80, 670);
        russia.addPoint(75, 700);
        russia.addPoint(65, 705);
        russia.addPoint(30, 580);
        russia.addPoint(90, 550);
        russia.addPoint(70, 440);
        g.fillPolygon(russia);
        g.setColor(Color.black);
    }

    public void drawHammer(Graphics2D g) {
        g.setColor(Color.yellow);
        Polygon hammer = new Polygon();
        hammer.addPoint(545, 455);
        hammer.addPoint(580, 420);
        hammer.addPoint(600, 425);
        hammer.addPoint(580, 445);
        hammer.addPoint(680, 545);
        hammer.addPoint(670, 555);
        hammer.addPoint(570, 455);
        hammer.addPoint(555, 470);
        g.fillPolygon(hammer);
        g.setColor(Color.black);
    }

    public void drawSickle(Graphics2D g) {
        g.setColor(Color.yellow);
        Polygon sickle = new Polygon();
        sickle.addPoint(557, 518);
        sickle.addPoint(572, 533);
        sickle.addPoint(542, 563);
        sickle.addPoint(532, 553);
        g.fillPolygon(sickle);
        g.fillOval(520, 380, 160, 160);
        g.setColor(Color.red);
        g.fillOval(505, 365, 160, 160);
        g.setColor(Color.black);
    }

    public void drawGrid(Graphics2D g) {
        g.setColor(Color.black);
        for (int i = 50; i < 1920; i += 50) {
            g.drawLine(i, 0, i, 1080);
        }
        for (int i = 50; i < 1080; i += 50) {
            g.drawLine(0, i, 1920, i);
        }
    }

    public String createRank(String branch) {
        Random random = new Random();
        switch (branch) {
            case "Army" : {
                return ranks[0][random.nextInt(29)];
            }
            case "Navy" : {
                return ranks[1][random.nextInt(26)];
            }
            case "Marine Corps" : {
                return ranks[2][random.nextInt(28)];
            }
            case "Coast Guard" : {
                return ranks[3][random.nextInt(26)];
            }
            case "Air Force" : {
                return ranks[4][random.nextInt(22)];
            }
            case "Space Force" : {
                return ranks[5][random.nextInt(22)];
            }
            default : {
                return "No Rank";
            }
        }
    }

    public String createBranch() {
        Random random = new Random();
        return branches[random.nextInt(6)];
    }

    public String createGender() {
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            return "Male";
        }
        return "Female";
    }

    public String createFirstName(String gender) {
        Random random = new Random();
        switch (gender) {
            case "Male" : {
                return maleNames[random.nextInt(30)];
            }
            case "Female" : {
                return femaleNames[random.nextInt(30)];
            }
            default : {
                return "Genderless";
            }
        }
    }

    public String createLastName() {
        Random random = new Random();
        return lastNames[random.nextInt(20)];
    }

    public Color createHairColor() {
        Random random = new Random();
        return hairColors[random.nextInt(24)];
    }

    public Color createClothingColor() {
        Random random = new Random();
        return clothingColors[random.nextInt(32)];
    }

    public void setSkinColors() {
        skinColors = new Color[12];
        skinColors[0] = new Color(255, 242, 230);
        skinColors[1] = new Color(255, 229, 204);
        skinColors[2] = new Color(255, 215, 179);
        skinColors[3] = new Color(255, 201, 153);
        skinColors[4] = new Color(255, 187, 128);
        skinColors[5] = new Color(255, 173, 102);
        skinColors[6] = new Color(255, 160, 77);
        skinColors[7] = new Color(204, 95, 0);
        skinColors[8] = new Color(179, 83, 0);
        skinColors[9] = new Color(153, 71, 0);
        skinColors[10] = new Color(128, 60, 0);
        skinColors[11] = new Color(102, 48, 0);
    }

    public void setHairColors() {
        hairColors = new Color[24];
        hairColors[0] = new Color(9,8,6);
        hairColors[1] = new Color(44,34,43);
        hairColors[2] = new Color(113,99,90);
        hairColors[3] = new Color(183,166,158);
        hairColors[4] = new Color(214,196,194);
        hairColors[5] = new Color(202,191,177);
        hairColors[6] = new Color(220,208,186);
        hairColors[7] = new Color(255,245,225);
        hairColors[8] = new Color(230,206,168);
        hairColors[9] = new Color(229,200,168);
        hairColors[10] = new Color(222,188,153);
        hairColors[11] = new Color(184,151,120);
        hairColors[12] = new Color(165,107,70);
        hairColors[13] = new Color(181,82,57);
        hairColors[14] = new Color(141,74,67);
        hairColors[15] = new Color(145,85,61);
        hairColors[16] = new Color(83,61,50);
        hairColors[17] = new Color(59,48,36);
        hairColors[18] = new Color(85,72,56);
        hairColors[19] = new Color(78,67,63);
        hairColors[20] = new Color(80,68,68);
        hairColors[21] = new Color(106,78,66);
        hairColors[22] = new Color(167,133,106);
        hairColors[23] = new Color(151,121,97);
    }

    public void setClothingColors() {
        clothingColors = new Color[32];
        clothingColors[0] = new Color(255, 255, 240);
        clothingColors[1] = new Color(245, 245, 220);
        clothingColors[2] = new Color(245, 222, 179);
        clothingColors[3] = new Color(210, 180, 140);
        clothingColors[4] = new Color(195, 176, 145);
        clothingColors[5] = new Color(192, 192, 192);
        clothingColors[6] = new Color(128, 128, 128);
        clothingColors[7] = new Color(70, 70, 70);
        clothingColors[8] = new Color(0, 0, 128);
        clothingColors[9] = new Color(8, 76, 158);
        clothingColors[10] = new Color(0, 0, 205);
        clothingColors[11] = new Color(0, 127, 255);
        clothingColors[12] = new Color(0, 255, 255);
        clothingColors[13] = new Color(127, 255, 212);
        clothingColors[14] = new Color(0, 128, 128);
        clothingColors[15] = new Color(34, 139, 34);
        clothingColors[16] = new Color(128, 128, 0);
        clothingColors[17] = new Color(127, 255, 0);
        clothingColors[18] = new Color(191, 255, 0);
        clothingColors[19] = new Color(255, 215, 0);
        clothingColors[20] = new Color(218, 165, 32);
        clothingColors[21] = new Color(255, 127, 80);
        clothingColors[22] = new Color(250, 128, 114);
        clothingColors[23] = new Color(252, 15, 192);
        clothingColors[24] = new Color(255, 119, 255);
        clothingColors[25] = new Color(204, 136, 153);
        clothingColors[26] = new Color(224, 176, 255);
        clothingColors[27] = new Color(181, 126, 220);
        clothingColors[28] = new Color(132, 49, 121);
        clothingColors[29] = new Color(75, 0, 130);
        clothingColors[30] = new Color(128, 0, 0);
        clothingColors[31] = new Color(220, 20, 60);
    }

    public void setRanks() {
        String armyRanks[] = new String[29];
        armyRanks[0] = "Private";
        armyRanks[1] = "Private Second Class";
        armyRanks[2] = "Private First Class";
        armyRanks[3] = "Specialist";
        armyRanks[4] = "Corporal";
        armyRanks[5] = "Sergeant";
        armyRanks[6] = "Staff Sergeant";
        armyRanks[7] = "Sergeant First Class";
        armyRanks[8] = "Master Sergeant";
        armyRanks[9] = "First Sergeant";
        armyRanks[10] = "Sergeant Major";
        armyRanks[11] = "Command Sergeant Major";
        armyRanks[12] = "Sergeant Major Of The Army";
        armyRanks[13] = "Warrant Officer 1";
        armyRanks[14] = "Chief Warrant Officer 2";
        armyRanks[15] = "Chief Warrant Officer 3";
        armyRanks[16] = "Chief Warrant Officer 4";
        armyRanks[17] = "Chief Warrant Officer 5";
        armyRanks[18] = "Second Lieutenant";
        armyRanks[19] = "First Lieutenant";
        armyRanks[20] = "Captain";
        armyRanks[21] = "Major";
        armyRanks[22] = "Lieutenant Colonel";
        armyRanks[23] = "Colonel";
        armyRanks[24] = "Brigadier General";
        armyRanks[25] = "Major General";
        armyRanks[26] = "Lieutenant General";
        armyRanks[27] = "General";
        armyRanks[28] = "General Of The Army";

        String navyRanks[] = new String[26];
        navyRanks[0] = "Seaman Recruit";
        navyRanks[1] = "Seaman Apprentice";
        navyRanks[2] = "Seaman";
        navyRanks[3] = "Petty Officer Third Class";
        navyRanks[4] = "Petty Officer Second Class";
        navyRanks[5] = "Petty Officer First Class";
        navyRanks[6] = "Chief Petty Officer";
        navyRanks[7] = "Senior Chief Petty Officer";
        navyRanks[8] = "Master Chief Petty Officer";
        navyRanks[9] = "Command Master Chief Petty Officer";
        navyRanks[10] = "Master Chief Petty Officer Of The Navy";
        navyRanks[11] = "Chief Warrant Officer 2";
        navyRanks[12] = "Chief Warrant Officer 3";
        navyRanks[13] = "Chief Warrant Officer 4";
        navyRanks[14] = "Chief Warrant Officer 5";
        navyRanks[15] = "Ensign";
        navyRanks[16] = "Lieutenant Junior Grade";
        navyRanks[17] = "Lieutenant";
        navyRanks[18] = "Lieutenant Commander";
        navyRanks[19] = "Commander";
        navyRanks[20] = "Captain";
        navyRanks[21] = "Rear Admiral Lower Half";
        navyRanks[22] = "Rear Admiral";
        navyRanks[23] = "Vice Admiral";
        navyRanks[24] = "Admiral";
        navyRanks[25] = "Fleet Admiral";

        String marineRanks[] = new String[28];
        marineRanks[0] = "Private";
        marineRanks[1] = "Private First Class";
        marineRanks[2] = "Lance Corporal";
        marineRanks[3] = "Corporal";
        marineRanks[4] = "Sergeant";
        marineRanks[5] = "Staff Sergeant";
        marineRanks[6] = "Gunnery Sergeant";
        marineRanks[7] = "Master Sergeant";
        marineRanks[8] = "First Sergeant";
        marineRanks[9] = "Master Gunnery Sergeant";
        marineRanks[10] = "Sergeant Major";
        marineRanks[11] = "Sergeant Major Of The Marine Corps";
        marineRanks[12] = "Warrant Officer 1";
        marineRanks[13] = "Chief Warrant Officer 2";
        marineRanks[14] = "Chief Warrant Officer 3";
        marineRanks[15] = "Chief Warrant Officer 4";
        marineRanks[16] = "Chief Warrant Officer 5";
        marineRanks[17] = "Second Lieutenant";
        marineRanks[18] = "First Lieutenant";
        marineRanks[19] = "Captain";
        marineRanks[20] = "Major";
        marineRanks[21] = "Lieutenant Colonel";
        marineRanks[22] = "Colonel";
        marineRanks[23] = "Brigadier General";
        marineRanks[24] = "Major General";
        marineRanks[25] = "Lieutenant General";
        marineRanks[26] = "General";
        marineRanks[27] = "General Of The Marine Corps";

        String coastGuardRanks[] = new String[26];
        coastGuardRanks[0] = "Seaman Recruit";
        coastGuardRanks[1] = "Seaman Apprentice";
        coastGuardRanks[2] = "Seaman";
        coastGuardRanks[3] = "Petty Officer Third Class";
        coastGuardRanks[4] = "Petty Officer Second Class";
        coastGuardRanks[5] = "Petty Officer First Class";
        coastGuardRanks[6] = "Chief Petty Officer";
        coastGuardRanks[7] = "Senior Chief Petty Officer";
        coastGuardRanks[8] = "Master Chief Petty Officer";
        coastGuardRanks[9] = "Command Master Chief Petty Officer";
        coastGuardRanks[10] = "Master Chief Petty Officer Of The Coast Guard";
        coastGuardRanks[11] = "Chief Warrant Officer 2";
        coastGuardRanks[12] = "Chief Warrant Officer 3";
        coastGuardRanks[13] = "Chief Warrant Officer 4";
        coastGuardRanks[14] = "Chief Warrant Officer 5";
        coastGuardRanks[15] = "Ensign";
        coastGuardRanks[16] = "Lieutenant Junior Grade";
        coastGuardRanks[17] = "Lieutenant";
        coastGuardRanks[18] = "Lieutenant Commander";
        coastGuardRanks[19] = "Commander";
        coastGuardRanks[20] = "Captain";
        coastGuardRanks[21] = "Rear Admiral Lower Half";
        coastGuardRanks[22] = "Rear Admiral";
        coastGuardRanks[23] = "Vice Admiral";
        coastGuardRanks[24] = "Admiral";
        coastGuardRanks[25] = "Fleet Admiral";

        String airForceRanks[] = new String[22];
        airForceRanks[0] = "Airman Basic";
        airForceRanks[1] = "Airman";
        airForceRanks[2] = "Airman First Class";
        airForceRanks[3] = "Senior Airman";
        airForceRanks[4] = "Staff Sergeant";
        airForceRanks[5] = "Technical Sergeant";
        airForceRanks[6] = "Master Sergeant";
        airForceRanks[7] = "Senior Master Sergeant";
        airForceRanks[8] = "Chief Master Sergeant";
        airForceRanks[9] = "Command Chief Master Sergeant";
        airForceRanks[10] = "Chief Master Sergeant Of The Air Force";
        airForceRanks[11] = "Second Lieutenant";
        airForceRanks[12] = "First Lieutenant";
        airForceRanks[13] = "Captain";
        airForceRanks[14] = "Major";
        airForceRanks[15] = "Lieutenant Colonel";
        airForceRanks[16] = "Colonel";
        airForceRanks[17] = "Brigadier General";
        airForceRanks[18] = "Major General";
        airForceRanks[19] = "Lieutenant General";
        airForceRanks[20] = "General";
        airForceRanks[21] = "General Of The Air Force";

        String spaceForceRanks[] = new String[22];
        spaceForceRanks[0] = "Spaceman Basic";
        spaceForceRanks[1] = "Spaceman";
        spaceForceRanks[2] = "Spaceman First Class";
        spaceForceRanks[3] = "Senior Spaceman";
        spaceForceRanks[4] = "Staff Sergeant";
        spaceForceRanks[5] = "Technical Sergeant";
        spaceForceRanks[6] = "Master Sergeant";
        spaceForceRanks[7] = "Senior Master Sergeant";
        spaceForceRanks[8] = "Chief Master Sergeant";
        spaceForceRanks[9] = "Command Chief Master Sergeant";
        spaceForceRanks[10] = "Chief Master Sergeant Of The Space Force";
        spaceForceRanks[11] = "Second Lieutenant";
        spaceForceRanks[12] = "First Lieutenant";
        spaceForceRanks[13] = "Captain";
        spaceForceRanks[14] = "Major";
        spaceForceRanks[15] = "Lieutenant Colonel";
        spaceForceRanks[16] = "Colonel";
        spaceForceRanks[17] = "Brigadier General";
        spaceForceRanks[18] = "Major General";
        spaceForceRanks[19] = "Lieutenant General";
        spaceForceRanks[20] = "General";
        spaceForceRanks[21] = "General Of The Space Force";

        ranks = new String[6][29];
        ranks[0] = armyRanks;
        ranks[1] = navyRanks;
        ranks[2] = marineRanks;
        ranks[3] = coastGuardRanks;
        ranks[4] = airForceRanks;
        ranks[5] = spaceForceRanks;
    }

    public void setBranches() {
        branches = new String[6];
        branches[0] = "Army";
        branches[1] = "Navy";
        branches[2] = "Marine Corps";
        branches[3] = "Coast Guard";
        branches[4] = "Air Force";
        branches[5] = "Space Force";
    }

    public void setMaleNames() {
        maleNames = new String[30];
        maleNames[0] = "Aleksander";
        maleNames[1] = "Maxim";
        maleNames[2] = "Artem";
        maleNames[3] = "Mikhail";
        maleNames[4] = "Daniil";
        maleNames[5] = "Ivan";
        maleNames[6] = "Dmitri";
        maleNames[7] = "Kirill";
        maleNames[8] = "Andrei";
        maleNames[9] = "Igor";
        maleNames[10] = "Ilya";
        maleNames[11] = "Timofei";
        maleNames[12] = "Alexei";
        maleNames[13] = "Matvei";
        maleNames[14] = "Nikita";
        maleNames[15] = "Vladimir";
        maleNames[16] = "Roman";
        maleNames[17] = "Mark";
        maleNames[18] = "Yaroslav";
        maleNames[19] = "Fyodor";
        maleNames[20] = "Sergei";
        maleNames[21] = "Lev";
        maleNames[22] = "Stepan";
        maleNames[23] = "Konstantin";
        maleNames[24] = "Vladislav";
        maleNames[25] = "Georgi";
        maleNames[26] = "Nikolai";
        maleNames[27] = "Gleb";
        maleNames[28] = "Timur";
        maleNames[29] = "Pavel";

    }

    public void setFemaleNames() {
        femaleNames = new String[30];
        femaleNames[0] = "Sofia";
        femaleNames[1] = "Maria";
        femaleNames[2] = "Anastasia";
        femaleNames[3] = "Anna";
        femaleNames[4] = "Elizaveta";
        femaleNames[5] = "Viktoria";
        femaleNames[6] = "Darya";
        femaleNames[7] = "Polina";
        femaleNames[8] = "Varvara";
        femaleNames[9] = "Alisa";
        femaleNames[10] = "Aleksandra";
        femaleNames[11] = "Yekaterina";
        femaleNames[12] = "Ksenia";
        femaleNames[13] = "Arina";
        femaleNames[14] = "Veronika";
        femaleNames[15] = "Vasilia";
        femaleNames[16] = "Valeria";
        femaleNames[17] = "Milana";
        femaleNames[18] = "Uliana";
        femaleNames[19] = "Yeva";
        femaleNames[20] = "Kira";
        femaleNames[21] = "Vera";
        femaleNames[22] = "Margarita";
        femaleNames[23] = "Aliena";
        femaleNames[24] = "Kristina";
        femaleNames[25] = "Alina";
        femaleNames[26] = "Taisia";
        femaleNames[27] = "Olga";
        femaleNames[28] = "Diana";
        femaleNames[29] = "Yulia";

    }

    public void setLastNames() {
        lastNames = new String[20];
        lastNames[0] = "Ivanov";
        lastNames[1] = "Smirnov";
        lastNames[2] = "Kuznetsov";
        lastNames[3] = "Popov";
        lastNames[4] = "Vasiliev";
        lastNames[5] = "Petrov";
        lastNames[6] = "Sokolov";
        lastNames[7] = "Mikhailov";
        lastNames[8] = "Fedorov";
        lastNames[9] = "Morozov";
        lastNames[10] = "Volkov";
        lastNames[11] = "Alexeev";
        lastNames[12] = "Lebedev";
        lastNames[13] = "Semenov";
        lastNames[14] = "Egorov";
        lastNames[15] = "Pavlov";
        lastNames[16] = "Kozlov";
        lastNames[17] = "Stepanov";
        lastNames[18] = "Nikolaev";
        lastNames[19] = "Orlov";

    }

    public int getNumRussians() { return numRussians; }
    public int getNumSoldiers() { return numSoldiers; }

    public void setNumRussians(int numRussians) { this.numRussians = numRussians; }
    public void setNumSoldiers(int numSoldiers) { this.numSoldiers = numSoldiers; }
}