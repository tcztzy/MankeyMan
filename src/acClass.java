//
// Source code recreated from name .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public final class acClass extends aa {
    private static aa g;
    private static d[] h;
    private static at[] i;
    private static u j;
    private static f k;
    private static int l;
    private static int m = -1;
    private static int n;
    private static int o;
    private static int p;
    private static boolean q;
    private static boolean r;
    public static boolean a;
    public static boolean b = false;
    private static d[] s;
    private static d[] t;
    private d[] u;
    public static boolean c;
    private d[] v;
    private boolean w;
    private d[] x;
    private at[] y;
    private int z;
    private int A;
    private int B;
    private boolean C;
    private static int[] digit = new int[]{1, 10, 100, 1000, 10000, 100000};
    private static final String[] NUMBER = new String[]{"０", "１", "２", "３", "４", "５", "６", "７", "８", "９", "　", "", "－"};
    private static final String[] SEASONS = new String[]{"春", "夏", "秋", "冬"};
    private static final String[] GENDER = new String[]{"♂", "♀"};
    private static l[] H = new l[]{new l(199, 122), new l(200, 121), new l(198, 120), new l(195, 60), new l(194, 79), new l(193, 64), new l(192, 76), new l(191, 61), new l(190, 88), new l(189, 73), new l(188, 82), new l(187, 67), new l(186, 85), new l(185, 70), new l(184, 80), new l(183, 65), new l(182, 77), new l(181, 62), new l(180, 89), new l(179, 74), new l(178, 83), new l(177, 68), new l(176, 86), new l(175, 71), new l(174, 81), new l(173, 66), new l(172, 78), new l(171, 63), new l(170, 90), new l(169, 75), new l(168, 84), new l(167, 69), new l(166, 87), new l(165, 72), new l(164, 107), new l(142, 98), new l(163, 30), new l(162, 100), new l(147, 99), new l(146, 103), new l(143, 27), new l(150, 96), new l(206, 4), new l(205, 1), new l(204, 2), new l(203, 3), new l(202, 5)};
    public static y[] d = new y[]{new y(0, 129), new y(1, 130), new y(2, 131), new y(3, 132), new y(4, 133), new y(5, 134), new y(6, 135), new y(7, 136), new y(8, 137), new y(9, 138), new y(10, 139), new y(11, 140), new y(12, 141), new y(13, 142), new y(14, 143), new y(15, 144), new y(16, 145), new y(17, 146), new y(18, 147), new y(19, 148), new y(20, 149), new y(21, 150), new y(22, 151), new y(23, 152), new y(24, 153), new y(25, 154), new y(26, 155), new y(27, 156), new y(28, 157), new y(29, 125), new y(30, 126), new y(31, 127), new y(32, 128)};
    static final Message[] MESSAGES = new Message[]{new Message(0, "前言"), new Message(1, "首先开展「采集」▽工作。部族为了▽生存必须通过采▽集等活动以获取▽食物维持生计。▽选择人物按确定▽键进而选择具体▽任务可以给个部▽族成员指派工作▽任务。"), new Message(2, "游戏开始"), new Message(3, "游戏正式开始，▽首先你要选出部▽落的首领，称之▽为「族长」。▽▽建议你选择综合▽能力优秀的成员▽当族长，赢在起▽跑线上嘛^_^▽▽游戏的玩法：可▽以在游戏菜单中▽（按＊键调出菜▽单）选择［帮助▽］来查阅。▽游戏存档∶系统▽自动执行存档。▽每个季度活动结▽束后系统将自动▽保存游戏进度。"), new Message(4, "狩猎"), new Message(5, "「狩猎」可以猎▽杀动物获取食物▽等资源。要想成▽功狩猎，必须结▽合团队力量以及▽利用石器工具。▽最初数量不足，▽所以必须打造了▽一定数量的石器▽之后才能进行狩▽猎活动。▽在没有发明石器▽的时代，狩猎的▽效率和成功率较▽低。"), new Message(6, "采集食物"), new Message(7, "通过「采集」活▽动可获取食物，▽开始时每人每次▽可采集两个食物▽。▽每次活动全体成▽员都需要消耗食▽物，消耗量为每▽人一份食物。"), new Message(8, "打造石器"), new Message(9, "「石器」可用于▽狩猎和部落之间▽交易，当与其他▽部落发生冲突战▽争时也会消耗石▽器。如果没有石▽器，狩猎的成功▽率会大大降低。▽因此，常备石器，▽有备无患。"), new Message(10, "休息"), new Message(11, "适当的「休息」▽能够产生各种各▽样的功效。在辛▽勤劳动之后就适▽当休息吧。▽部落生活愉悦富▽足，可能会意想▽不到的收获，甚▽至可能会吸引异▽族来投靠呢！▽O(∩_∩)O.."), new Message(12, "祈祷"), new Message(13, "「祈祷」是族长▽才能执行的工作。▽如果祈祷能够打▽动上苍，说不定▽会出现奇迹哦。▽但如果不够诚心▽或过于贪婪，也▽可能会受到上苍▽的惩罚^_^..."), new Message(14, "食物腐烂了！"), new Message(15, "食物保存时间久▽了会腐烂。获取▽的食物只能保存▽一年（即四个季▽度）。▽水果和猎物资源▽的生长需要时间，▽所以建议不要滥▽捕滥采。"), new Message(16, "气候恶劣"), new Message(17, "当前居住地的气▽候环境已不适合▽生活了。▽如果画面上的温▽度计闪烁或熄灭▽了则表示气温恶▽劣不适合居住。▽气候不宜时猿人▽的技能会降低而▽无法制作石器，▽也无法怀孕。"), new Message(18, "婴儿"), new Message(19, "新婴儿诞生啦。▽婴儿不能指派工▽作，只能休息。▽但婴儿也同样要▽消费一份食物。"), new Message(20, "进化"), new Message(21, "成功进化为“猿▽人”啦！"), new Message(22, "进化"), new Message(23, "成功进化为“猿▽人后期”了！"), new Message(24, "进化"), new Message(25, "成功进化为“能▽人”啦！"), new Message(26, "进化"), new Message(27, "成功进化为“能▽人后期”了！"), new Message(28, "进化"), new Message(29, "成功进化为“直▽立人”啦！"), new Message(30, "进化"), new Message(31, "成功进化为“直▽立人▽后期”了！"), new Message(32, "进化"), new Message(33, "成功进化为“智▽人”啦！"), new Message(34, "空腹"), new Message(35, "有人空腹挨饿。▽如果继续没有食▽物吃它就会饿死。▽食物按照族长→▽婴幼儿→成年▽（女→男）的顺▽序进行分配。"), new Message(36, "幼儿"), new Message(37, "婴儿已经成长为▽幼儿。幼儿时期▽除了「休息」还▽可以参加「采集」▽活动。"), new Message(38, "老人"), new Message(39, "曾经是劳动主力，▽如今已经年老了。▽老人将无法参加▽狩猎和石器制作▽工作。"), new Message(40, "怀孕"), new Message(41, "已经怀孕了！宝▽宝将在四个季度▽后出生。▽怀孕期间不能参▽加狩猎活动哦。"), new Message(42, "受伤 生病"), new Message(43, "受伤或生病了。▽受伤或生病后不▽能从事「休息」▽外的活动，只能▽通过「休息」才▽能康复。▽但族长还能进行▽「祈祷」活动。"), new Message(44, "族长即位"), new Message(45, "族长死亡后，需▽要选出新的族长。▽请确定新族长。"), new Message(46, "食物不足"), new Message(47, "本地区食物资源▽已不多了，是该▽考虑迁徙的时候▽了！按「迁徙」▽键可进入迁徙移▽居界面。"), new Message(48, "迁徙"), new Message(49, "可以迁徙到当前▽地区的相邻区域▽（上下左右四个▽地区）。▽▽按方向键选择地▽区，可查看各地▽区的果物和猎物▽等资源数量，也▽要注意恐龙以及▽可能发生灾害的▽警示标志。▽注意，迁徙后的▽第一个季节不能▽开展任何工作，▽但食物会正常消▽耗，因此迁徙前▽要检查食物的数▽量，未雨绸缪。"), new Message(50, "雨季"), new Message(51, "当前地区这个季▽节似乎比较多雨。▽很可能狩猎会不▽顺利，也无法轻▽松享受休息。"), new Message(52, "晴天"), new Message(53, "天气真好啊！这▽个时候狩猎、休▽息等都将会比较▽顺利。赶快行动▽吧^_^…"), new Message(54, "其他部落"), new Message(55, "和其他异族部落▽发生了接触。可▽能会发生冲突，▽石器储量较少时▽可能会面临危险。"), new Message(56, "恐龙"), new Message(57, "附近有恐龙出没！▽⊙﹏⊙如果恐龙▽进入到本地区，▽弱小的族员将可▽能被袭击死亡。▽如果发现恐龙在▽附近出没，建议▽考虑搬家迁徙为▽妙。"), new Message(58, "恐龙"), new Message(59, "恐龙多起来了！▽为使族群免遭袭▽击，必须加倍小▽心注意！⊙﹏⊙ "), new Message(60, "龙卷风"), new Message(61, "发生龙卷风了！▽发生龙卷风的地▽区，在龙卷风停▽息前不能迁徙。"), new Message(62, "火灾"), new Message(63, "本地区发生火灾▽了。多木之地容▽易引发火灾。"), new Message(64, "中暑"), new Message(65, "本地区发生中暑▽了。因过于炎热▽可能引发死亡，▽有必要迁徙。"), new Message(66, "疫病"), new Message(67, "本地区有疫病在▽蔓延。不要惊慌▽失措，安静休养▽也是一个办法。"), new Message(68, "洪水"), new Message(69, "本地区爆发洪水▽了。可能会受伤▽而丢失性命，有▽必要迁徙。"), new Message(70, "旧海啸"), new Message(71, "●"), new Message(72, "冰河期来啦！"), new Message(73, "冰河期来到了。▽所有地方都将气▽温下降，水果及▽猎物、恐龙等的▽数目也会减少。"), new Message(74, "冰河期"), new Message(75, "冰河期更加严重▽了，气温更低了."), new Message(76, "冰河期"), new Message(77, "冰河期在慢慢减▽退，气温有所上▽升。"), new Message(78, "冰河期结束"), new Message(79, "漫长严峻的冰河▽期终于结束了。▽气温上升，水果▽及猎物、恐龙的▽数量也恢复了。"), new Message(80, "灭绝危机"), new Message(81, "部落遭遇了灭顶▽之灾。但只要不▽言放弃、顽强努▽力，也许可以度▽过危机。"), new Message(82, "谈判"), new Message(83, "能运用谈判技巧，▽和其他异族部落▽进行谈判。▽谈判是物物交换。▽食物20个、石器▽30个、男人一个、▽女人一个等的其▽中之一是必要条▽件。但是如果族▽长的经验不足，▽可能发生谈判无▽法进行或谈判失▽败等情况。"), new Message(84, "下雪"), new Message(85, "本地区这个季节▽似乎气温较低，▽寒冷难忍。很可▽能狩猎会不顺▽利、休息也基本▽▽无法享受。"), new Message(86, "─　游戏概述　　１/２▽游戏故事背景是猿猴放▽弃树上生活后迁转到地▽面生活，逐步进化成为▽新人类的生存历程。▽获取食物和繁衍子孙是▽猿猴在地上能生存繁衍▽进化的基本条件。获得▽尽可能高的积分可以加▽快进化速度。"), new Message(87, "─　游戏概述　　２/２▽▽猿猴如果得不到足够的▽食物维持生命就会饿死▽，或因为生病、受伤或▽命限已到等原因而致使▽子孙断绝，种族灭亡则▽游戏结束。"), new Message(88, "──────　操作方法 ▽方向键或2、4、6、▽8键选择项目；按确定▽键进行操作确认；根据▽情况也用左、右功能键▽来选择操作动作。▽在游戏过程中可以按＊▽键调出游戏主菜单以选▽择其它操作，例如：查▽看帮助、声音开启等。"), new Message(89, "─　游戏步骤　　１/４▽按确定键可给猿人安排▽工作，在狩猎、采集、▽石器、休息、祈祷等五▽个任务中进行选择然后▽按确定键进行指派，也▽可直接按上／下方向键▽来直接切换人物进行工▽作指派。有些工作需视▽猿人的状态才能选择。"), new Message(90, "─　游戏步骤　　２/４▽▽安排好部落成员的工作▽，按「出发」键执行任▽务，然后确认本季节的▽活动成果，根据收获情▽况决定下一步的工作安▽排。▽过了四个季度即一年，▽他们都将增加一岁。"), new Message(91, "─　游戏步骤　　３/４▽游戏主画面上部信息栏▽表示部落拥有的食物数▽及石器数，画面下部表▽示本地区蕴藏的果物、▽猎物等资源的数量。▽如果没有食物猿人们将▽会饿死，所以游戏过程▽中需要经常检查食物的▽状况，制定工作任务。"), new Message(92, "─　游戏步骤　　４/４▽▽当所在地区的水果、猎▽物等资源变得较少或发▽生灾害时，可以按功能▽键的「迁徙」指令，迁▽徙到条件适宜的地区以▽保证维持部落的生存和▽发展需要。"), new Message(93, "─ 工作任务・狩猎▽▽发现猎物并将其打倒即▽可获取猎物。▽在狩猎过程中可能会受▽伤。▽只有积累经验，发明更▽强的石器工具，才能提▽升狩猎的成功率，获取▽更多的猎物。"), new Message(94, "─ 工作任务・采集▽▽游戏中可以在部落当前▽居住地区采集果物、贝▽壳等食物。▽每个猿人开始时一次只▽能采集两个食物，但随▽着猿人的不断进化和发▽明工具，采集能力会提▽升。"), new Message(95, "─ 工作任务・石器▽在发明石器后，就能制▽作石器了。经验丰富以▽及[技能]、[工具]属性▽高的猿人，能一次制作▽更多的石器。▽专注于石器制造工作、▽经验丰富的猿人，工作▽过程中可能会发明更强▽的石器。"), new Message(96, "─ 工作任务・休息▽「休息」是子孙繁荣的▽必不可少之条件，男女▽配对享受休息待遇，可▽以更容易怀上孩子。▽另外，休息可以触发各▽种各样的发明创造。▽如果生病或受伤了，也▽必须经过「休息」才能▽康复。"), new Message(97, "─ 工作任务・祈祷▽▽「祈祷」是族长的专有▽技能，只有族长才能执▽行。祈祷可能会带来意▽想不到的收获，但也有▽可能会受到惩戒……，▽具体怎么样，留在游戏▽中体会吧。"), new Message(98, "──────　人体参数▽人的技能参数揭示了他▽更能胜任什么类型的工▽作。比如力量大、石器▽技能高的成员更适合狩▽猎，运气好的更容易在▽休息中得到意外收获。▽子孙会继承父辈们一定▽程度的属性。脑容量cc▽值是进化程度的标志。"), new Message(99, "──────　有关族长▽▽族长的工作效率比其他▽族群成员要高。▽反复从事相同的工作可▽以提升相应的属性。▽族长的后代其属性将会▽继承，能力也较高。"), new Message(100, "──────　其他部落▽▽进化到一定阶段后，可▽能会遭遇到其他异族部▽落。迁徙中遭遇异族部▽落时，会发生各种各样▽的事情。鼓起勇气勇于▽接触异族，也是猿人们▽获得灵感领悟的一个契▽机。"), new Message(101, "─　发明的意义　１/４▽▽发明能力因人而异。▽像观察火灾也许会有所▽启发而有新发明，在猎▽取各种各样的动物时，▽也可能会有所启发而创▽造出新的发明。"), new Message(102, "─　发明的意义　２/４▽▽平常怕寒的族员，也许▽会发明出新物品从而提▽升御寒能力。当食物大▽量腐烂后，兴许也会发▽现点什么。▽发明源于实践，具体要▽看部落的进化程度。"), new Message(103, "─　发明的意义　３/４▽▽疫病可能会招致灭顶之▽灾，但是通过积累经验▽和不断进化，也许有一▽天就可以坦然面对，从▽容处置了。▽眺望无垠大海，也会萌▽生出什么新东西呢…"), new Message(104, "─　发明的意义　４/４▽▽面对强悍凶暴的恐龙，▽不要害怕和退缩，勇敢▽面对，也许某一天就能▽将它打倒！"), new Message(105, "──────　建　议▽▽在任务指派的画面，左▽右方向键选择工作任务▽时，即使不按确定键，▽也可以通过上下键来确▽定任务，而且同时会切▽换到其他人物上。▽这个操作方式可快速给▽族员指派任务。"), new Message(106, "▽▽▽▽本游戏纯属虚构，与现▽代人类的进化学说多有▽不同。"), new Message(107, "您就是从树上下来的那只猴子。▽嬴弱的猴子要想发展智能不断进化▽、就必须想方设法在严酷的环▽境里生存下去。首先去获取食物、▽壮大部落吧。终有一天，您的部落将从古▽猿到能人、再向猿人、进而向直立人进化。▽最终到达接近现在人类的智人。"), new Message(108, "真棒！你的部落在▽严酷的地上生存下▽来，踏出了人类进▽化的重要一步。"), new Message(109, "～《猿人时代》 结束～▽▽▽▽下面游戏将无止▽境地一直可以进▽行下去。积分以▽及进化状态将不▽做记录。您可以▽悠闲的享用本游▽戏。"), new Message(110, "这是秘密哦"), new Message(111, "制作石器后休息 有时会 ▽受到很大启发哦  ，▽太喜欢休息了"), new Message(112, "找到了！原来在流沙里▽隐藏了许多水果，▽太好了！"), new Message(113, "打败其他部落需要很多▽的石器"), new Message(114, "族长真是 了不起！有族▽ 长 在， 大家 加油干啊！"), new Message(115, "天气会越来越寒冷的"), new Message(116, "要把各项属性都增加起▽来啊"), new Message(117, "受伤、生病会使寿命减▽少，休息能延长寿命！"), new Message(118, "火、动物的毛皮能让你▽暖和起来 "), new Message(119, "生病了！很多族员都生病▽了，不过不用太担心！"), new Message(120, "部落遇到灭绝危机不要▽绝望哦，说不定还有转▽机的。"), new Message(121, "瘟疫是会蔓延的"), new Message(122, "狩猎也是要看运气的"), new Message(123, "聪明人自然会生成聪明▽的后代！"), new Message(124, "石器会影响狩猎效率的"), new Message(125, "这么多食物都腐烂掉，▽多可惜呀，有没有好的▽办法呢？"), new Message(126, "寒冷的天气会使繁育后▽代、打造石器变得困难"), new Message(127, "夏天很热，冬天很冷，▽春天要多动脑筋哦"), new Message(128, "恐龙真可怕，逃到海里▽就不用害怕了吧？"), new Message(129, "常时间的晴天有可能会▽引发火灾，也有火灾蔓▽延不到的地方哦"), new Message(130, "神秘的咒语为部落的兴▽盛而祷告！"), new Message(131, "────────　得分榜▽"), new Message(132, "　---　"), new Message(133, "点▽"), new Message(134, "食物可以贮藏两年了！"), new Message(135, "感觉稍微温暖些了！"), new Message(136, "一点都不觉得寒冷了！"), new Message(137, "智力发育更好了！"), new Message(138, "每次的采集量提升为3个了！"), new Message(139, "感觉暖和多了！"), new Message(140, "智力发育已经很好了！"), new Message(141, "智力发育更好了！"), new Message(142, "更换音乐吧！"), new Message(143, "智能发育足够好了！"), new Message(144, "能够在海里捕鱼了！"), new Message(145, "石器制作一次的经验值增加了！"), new Message(146, "非常寒冷了！"), new Message(147, "可以和其他的部落交涉了！"), new Message(148, "免疫力增强了！"), new Message(149, "这样也许可以打倒恐龙。。。？"), new Message(150, "可以制造石器了！"), new Message(151, "狩猎的效率提高了！"), new Message(152, "狩猎的效率提高了！"), new Message(153, "狩猎的效率提高了！"), new Message(154, "狩猎一次的经验值提高了！"), new Message(155, "狩猎的效率更加提高了！"), new Message(156, "狩猎的效率更加提高了！"), new Message(157, "狩猎的效率更加提高了！"), new Message(158, "狩猎一次的经验值提高了！"), new Message(159, "狩猎的效率获得了很大提高！"), new Message(160, "狩猎的效率获得了很大提高！"), new Message(161, "狩猎的效率获得了很大提高！"), new Message(162, "发明出"), new Message(163, "▽"), new Message(164, "───────────　发明要点"), new Message(165, "---"), new Message(166, ""), new Message(167, " "), new Message(168, "等人"), new Message(169, "▽休养后身体更棒了。"), new Message(170, "恢复了！"), new Message(171, "等人恢复了！"), new Message(172, "捡到了"), new Message(173, "块肉！"), new Message(174, "在▽"), new Message(175, "制造出了"), new Message(176, "───────────　工作要点"), new Message(177, "的"), new Message(178, "点"), new Message(179, "▽找到了绿洲！"), new Message(180, "发现从其他部落里调队▽的婴儿了！"), new Message(181, "恐龙骨头"), new Message(182, "猛犸象牙"), new Message(183, "老虎牙"), new Message(184, "羚羊角"), new Message(185, "兔子骨"), new Message(186, "鹦鹉螺的壳"), new Message(187, "鱼骨"), new Message(188, "鲸鱼骨"), new Message(189, "恐龙皮"), new Message(190, "猛犸象皮"), new Message(191, "虎皮"), new Message(192, "羚羊皮"), new Message(193, "兔皮"), new Message(194, "骨制品"), new Message(195, "装饰物"), new Message(196, "食器"), new Message(197, "头饰"), new Message(198, "衣服"), new Message(199, "彫刻"), new Message(200, "婴儿"), new Message(201, "幼儿期"), new Message(202, "少年期"), new Message(203, "青年期"), new Message(204, "中年期"), new Message(205, "老年期"), new Message(206, "狩猎"), new Message(207, "采集"), new Message(208, "石器"), new Message(209, "休息"), new Message(210, "祈祷"), new Message(211, "捕鱼"), new Message(212, "采集"), new Message(213, "石器"), new Message(214, "休息"), new Message(215, "祈祷"), new Message(216, "下不中丹丽了人他伊休伤伽位候儿其冰凡凯判前劣化卡危即卷受古啦啸器图垛夏多天奈始娜婖婴孔孕季宏尚已巴布幼开式强徙徳怀恐息恶惠戏打文族旧昌晴暑期机束来果枫桑欧正气水河波泰洪海游火灭灾烂物狩猎玛琳瑞瑟生疫病皮石禆空米纱结绝罗美老腐腹芋芬莉菁萨落蒙虞裘言詹谈足迁进造部采金长阳集雨雪雷露风食龙祈祷　　　　　　　　　　　　　　　　"), new Message(217, "熏制技术"), new Message(218, "鞣革技术"), new Message(219, "衣服"), new Message(220, "语言"), new Message(221, "容器"), new Message(222, "生火技术"), new Message(223, "宗教"), new Message(224, "文字"), new Message(225, "音乐"), new Message(226, "艺术"), new Message(227, "木筏"), new Message(228, "量产技术"), new Message(229, "防寒技术"), new Message(230, "交涉技巧"), new Message(231, "预防疾病"), new Message(232, "恐龙战法"), new Message(233, "粗糙的石刀"), new Message(234, "普通的石刀"), new Message(235, "锋利的石刀"), new Message(236, "强化的锋利石刀"), new Message(237, "粗劣的石斧"), new Message(238, "普通的石斧"), new Message(239, "锋利的石斧"), new Message(240, "强化的锋利石斧"), new Message(241, "粗劣的长矛"), new Message(242, "普通的长矛"), new Message(243, "锋利的长矛"), new Message(244, "强化的锋利长矛"), new Message(245, "───────　部落人数▽"), new Message(246, "男  -------　"), new Message(247, "女  -------　"), new Message(248, "合计  ----　"), new Message(249, " ▽"), new Message(250, " ▽▽"), new Message(251, "───────　死亡人数▽"), new Message(252, "寿终  ----　"), new Message(253, "饿死  ----　"), new Message(254, "病死  ----　"), new Message(255, "伤亡  ----　"), new Message(256, "───────　狩猎记录▽"), new Message(257, "兔子  -------　"), new Message(258, "羚羊  -------　"), new Message(259, "老虎  -------　"), new Message(260, "猛犸象  ----　"), new Message(261, "鱼   ---------　"), new Message(262, "鹦鹉螺  ----　"), new Message(263, "鲸鱼  -------　"), new Message(264, "恐龙  -------　"), new Message(265, "合计  ----　"), new Message(266, "───────　采集记录▽"), new Message(267, "食物  --- "), new Message(268, "个▽▽"), new Message(269, "───────　石器记录▽"), new Message(270, "石器  --- "), new Message(271, "积分  --- "), new Message(272, "点▽"), new Message(273, "计时＝"), new Message(274, "▽腐烂 ・ "), new Message(275, "─────────　大事记▽"), new Message(276, "───────　其　它▽"), new Message(277, ""), new Message(278, "由于病情恶化，死了…"), new Message(279, "因伤势过重，死了…"), new Message(280, "因过度饥饿，死了…"), new Message(281, "因天命已尽，死了…"), new Message(282, "饿死      ---- "), new Message(283, "伤亡　 ---- "), new Message(284, "病死　 ---- "), new Message(285, "寿终　 ---- "), new Message(286, "───────　死亡点"), new Message(287, "采集到了"), new Message(288, "采集到0"), new Message(289, "个水果"), new Message(290, "个贝类"), new Message(291, "请给大家指派任务"), new Message(292, "工作任务："), new Message(293, "为了追求新的生活而离▽开了部落…"), new Message(294, "请选择迁徙地"), new Message(295, "和其他部落交涉成功"), new Message(296, "正在和其他部落交涉"), new Message(297, "请选择？"), new Message(298, "请选择给出的东西…"), new Message(299, "请选择想要的东西…"), new Message(300, "正在选择想要的东西…"), new Message(301, "是否这样交换？"), new Message(302, "请选择用于交换的族员"), new Message(303, "交涉失败了…"), new Message(304, "得到了20个食物▽"), new Message(305, "得到了30个石器▽"), new Message(306, "欢迎加入▽！"), new Message(307, "别的部落离开了"), new Message(308, "遇到其它部落了！"), new Message(309, "个食物▽"), new Message(310, "夺取了"), new Message(311, "个石器▽"), new Message(312, "消耗了"), new Message(313, "异族部落逃走了"), new Message(314, "　"), new Message(315, "被袭击了！"), new Message(316, "▽被抢走了"), new Message(317, "异族部落离开了"), new Message(318, "异族部落离开了"), new Message(319, "古猿时代"), new Message(320, "猿人时代"), new Message(321, "猿人时代后期"), new Message(322, "能人时代"), new Message(323, "能人时代后期"), new Message(324, "直立人时代"), new Message(325, "直立人时代后期"), new Message(326, "智人时代"), new Message(327, "恐龙"), new Message(328, "猛犸象"), new Message(329, "老虎"), new Message(330, "羚羊"), new Message(331, "兔子"), new Message(332, "鹦鹉螺"), new Message(333, "鱼"), new Message(334, "鲸鱼"), new Message(335, ""), new Message(336, "寿命"), new Message(337, "生病"), new Message(338, "受伤"), new Message(339, "饥饿"), new Message(340, "粗劣的"), new Message(341, "普通的"), new Message(342, "精致的"), new Message(343, "完美的"), new Message(344, "选择你想狩猎的动物"), new Message(345, "中止狩猎。"), new Message(346, "获得"), new Message(347, "块肉！▽"), new Message(348, "没找到猎物。。"), new Message(349, "狩猎失败了…▽"), new Message(350, "个石器▽"), new Message(351, "消耗了"), new Message(352, "捡到了"), new Message(353, "───────　狩猎积分"), new Message(354, "…"), new Message(355, "点×"), new Message(356, "匹＝"), new Message(357, "周边的火灾远去了"), new Message(358, "的恩惠得到了"), new Message(359, "个增加了！"), new Message(360, "得到的大自然的恩惠！▽"), new Message(361, "匹增加了！"), new Message(362, "▽的力量增加了一级！"), new Message(363, "▽的技能增加了一级"), new Message(364, "▽的运气增加了一级！"), new Message(365, "所有人的伤病都已痊愈了！"), new Message(366, "拜神祈祷未能感动上苍，族▽长的寿命缩短了…"), new Message(367, "成功制造出"), new Message(368, "未能成功打造石器…"), new Message(369, "从头开始游戏吗？"), new Message(370, "食物▽"), new Message(371, "腐烂掉了"), new Message(372, "───────　工作积分"), new Message(373, "───────　部落积分"), new Message(374, "───────　时代积分"), new Message(375, "迁徙　・・・"), new Message(376, "部落数"), new Message(377, "＊＊＊＊＊＊＊＊　获得积分"), new Message(378, "积分小计　・・"), new Message(379, "积分合计　・・"), new Message(380, "恭喜你，游戏任务完成！"), new Message(381, "部族灭亡了…"), new Message(382, "▽该页面的积分已被记录了"), new Message(383, "记录到此为止…"), new Message(384, ""), new Message(385, ""), new Message(386, "发生火灾了！"), new Message(387, "爆发洪水了！"), new Message(388, "发生中暑了！"), new Message(389, ""), new Message(390, "流行疫病了！"), new Message(391, "流行疫病了！"), new Message(392, "被恐龙袭击了！"), new Message(393, "大地的恩赐▽该地区"), new Message(394, "大海的恩赐▽该地区"), new Message(395, "个水果"), new Message(396, "个贝类"), new Message(397, "周边的灾害远去了！"), new Message(398, "得到了"), new Message(399, "增加了▽"), new Message(400, "得到的大自然的恩赐！▽"), new Message(401, "增加了▽"), new Message(402, "的力量增加了一级！"), new Message(403, "的技能增加了一级！"), new Message(404, "的运气增加了一级！"), new Message(405, "所有人的伤病都已痊愈了！"), new Message(406, "求神祈祷未能感动上苍，▽族长的寿命缩短了…"), new Message(407, "怀孕了")};
    private static final l[] I = new l[]{new l(0, 57), new l(1, 58)};
    private static final ap[] J = new ap[]{new ap(0, 0, 0, 0, new q(120, 60), 0, true), new ap(1, 1, 8, 0, new q(120, 188), 0, true)};
    private final l[] K = new l[]{new l(0, 111), new l(1, 97), new l(2, 21)};
    private static ap[] L = new ap[]{new ap(0, 0, 0, 0, new q(122, 72), 28667, true), new ap(1, 1, 0, 0, new q(120, 160), new z(0, 0, 240, 320), 28670, true), new ap(3, 2, 1, 0, new q(0, 0), new z(0, 0, 105, 72), 28669, true), new ap(4, 2, 3, 2, new q(240, 0), new z(0, 0, 105, 72), 28669, true), new ap(5, -1, 8, 0, new q(0, 0), new z(0, 0, 42, 20), 28663, true), new ap(6, -1, 8, 0, new q(0, 0), new z(0, 20, 42, 20), 28663, true), new ap(7, -1, 8, 0, new q(0, 0), new z(0, 40, 42, 20), 28663, true), new ap(8, -1, 8, 0, new q(0, 0), new z(0, 60, 42, 20), 28663, true), new ap(9, -1, 0, 0, new q(54, 200), 28665, true), new ap(10, -1, 0, 0, new q(99, 200), 28665, true), new ap(11, -1, 0, 0, new q(145, 200), 28665, true), new ap(12, -1, 0, 0, new q(189, 200), 28665, true), new ap(13, -1, 0, 0, new q(0, 0), new z(13, 0, 12, 15), 28663, false), new ap(14, -1, 0, 0, new q(0, 0), new z(25, 0, 12, 15), 28663, false)};
    private static final c[] M = new c[]{new c(3, 195, new z(0, 0, 26, 34), 8, 0), new c(3, 195, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] N = new c[]{new c(3, 195, new z(104, 0, 26, 34), 8, 0), new c(3, 195, new z(130, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] O = new c[]{new c(3, 195, new z(52, 34, 26, 34), 8, 0), new c(3, 195, new z(78, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] P = new c[]{new c(3, 194, new z(0, 0, 26, 34), 8, 0), new c(3, 194, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] Q = new c[]{new c(3, 184, new z(0, 0, 26, 34), 8, 0), new c(3, 184, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] R = new c[]{new c(3, 174, new z(0, 0, 32, 36), 8, 0), new c(3, 174, new z(32, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] S = new c[]{new c(3, 194, new z(52, 0, 26, 34), 8, 0), new c(3, 194, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] T = new c[]{new c(3, 184, new z(52, 0, 26, 34), 8, 0), new c(3, 184, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] U = new c[]{new c(3, 174, new z(64, 0, 32, 36), 8, 0), new c(3, 174, new z(96, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] V = new c[]{new c(3, 192, new z(0, 0, 26, 34), 8, 0), new c(3, 192, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] W = new c[]{new c(3, 182, new z(0, 0, 26, 34), 8, 0), new c(3, 182, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] X = new c[]{new c(3, 172, new z(0, 0, 32, 36), 8, 0), new c(3, 172, new z(32, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] Y = new c[]{new c(3, 192, new z(104, 0, 26, 34), 8, 0), new c(3, 192, new z(0, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] Z = new c[]{new c(3, 182, new z(104, 0, 26, 34), 8, 0), new c(3, 182, new z(0, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aa = new c[]{new c(3, 172, new z(128, 0, 32, 36), 8, 0), new c(3, 172, new z(0, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ab = new c[]{new c(3, 192, new z(52, 0, 26, 34), 8, 0), new c(3, 192, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ac = new c[]{new c(3, 182, new z(52, 0, 26, 34), 8, 0), new c(3, 182, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ad = new c[]{new c(3, 172, new z(64, 0, 32, 36), 8, 0), new c(3, 172, new z(96, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ae = new c[]{new c(3, 192, new z(26, 34, 26, 34), 8, 0), new c(3, 192, new z(52, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] af = new c[]{new c(3, 182, new z(26, 34, 26, 34), 8, 0), new c(3, 182, new z(52, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ag = new c[]{new c(3, 172, new z(32, 36, 32, 36), 8, 0), new c(3, 172, new z(64, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ah = new c[]{new c(3, 192, new z(78, 34, 26, 34), 8, 0), new c(3, 192, new z(104, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ai = new c[]{new c(3, 182, new z(78, 34, 26, 34), 8, 0), new c(3, 182, new z(104, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aj = new c[]{new c(3, 172, new z(96, 36, 32, 36), 8, 0), new c(3, 172, new z(128, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ak = new c[]{new c(3, 190, new z(0, 0, 26, 36), 8, 0), new c(3, 190, new z(26, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] al = new c[]{new c(3, 180, new z(0, 0, 26, 36), 8, 0), new c(3, 180, new z(26, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] am = new c[]{new c(3, 170, new z(0, 0, 32, 36), 8, 0), new c(3, 170, new z(32, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] an = new c[]{new c(3, 190, new z(104, 0, 26, 36), 8, 0), new c(3, 190, new z(0, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ao = new c[]{new c(3, 180, new z(104, 0, 26, 36), 8, 0), new c(3, 180, new z(0, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ap = new c[]{new c(3, 170, new z(128, 0, 32, 36), 8, 0), new c(3, 170, new z(0, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aq = new c[]{new c(3, 190, new z(52, 0, 26, 36), 8, 0), new c(3, 190, new z(78, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ar = new c[]{new c(3, 180, new z(52, 0, 26, 36), 8, 0), new c(3, 180, new z(78, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] as = new c[]{new c(3, 170, new z(64, 0, 32, 36), 8, 0), new c(3, 170, new z(96, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] at = new c[]{new c(3, 190, new z(26, 36, 26, 36), 8, 0), new c(3, 190, new z(52, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] au = new c[]{new c(3, 180, new z(26, 36, 26, 36), 8, 0), new c(3, 180, new z(52, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] av = new c[]{new c(3, 170, new z(32, 36, 32, 36), 8, 0), new c(3, 170, new z(64, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aw = new c[]{new c(3, 190, new z(78, 36, 26, 36), 8, 0), new c(3, 190, new z(104, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ax = new c[]{new c(3, 180, new z(78, 36, 26, 36), 8, 0), new c(3, 180, new z(104, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ay = new c[]{new c(3, 170, new z(96, 36, 32, 36), 8, 0), new c(3, 170, new z(128, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] az = new c[]{new c(3, 188, new z(0, 0, 26, 34), 8, 0), new c(3, 188, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aA = new c[]{new c(3, 178, new z(0, 0, 26, 34), 8, 0), new c(3, 178, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aB = new c[]{new c(3, 168, new z(0, 0, 32, 36), 8, 0), new c(3, 168, new z(32, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aC = new c[]{new c(3, 188, new z(104, 0, 26, 34), 8, 0), new c(3, 188, new z(0, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aD = new c[]{new c(3, 178, new z(104, 0, 26, 34), 8, 0), new c(3, 178, new z(0, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aE = new c[]{new c(3, 168, new z(128, 0, 32, 36), 8, 0), new c(3, 168, new z(0, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aF = new c[]{new c(3, 188, new z(52, 0, 26, 34), 8, 0), new c(3, 188, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aG = new c[]{new c(3, 178, new z(52, 0, 26, 34), 8, 0), new c(3, 178, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aH = new c[]{new c(3, 168, new z(64, 0, 32, 36), 8, 0), new c(3, 168, new z(96, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aI = new c[]{new c(3, 188, new z(26, 34, 26, 34), 8, 0), new c(3, 188, new z(52, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aJ = new c[]{new c(3, 178, new z(26, 34, 26, 34), 8, 0), new c(3, 178, new z(52, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aK = new c[]{new c(3, 168, new z(32, 36, 32, 36), 8, 0), new c(3, 168, new z(64, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aL = new c[]{new c(3, 188, new z(78, 34, 26, 34), 8, 0), new c(3, 188, new z(104, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aM = new c[]{new c(3, 178, new z(78, 34, 26, 34), 8, 0), new c(3, 178, new z(104, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aN = new c[]{new c(3, 168, new z(96, 36, 32, 36), 8, 0), new c(3, 168, new z(128, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aO = new c[]{new c(3, 186, new z(0, 0, 26, 34), 8, 0), new c(3, 186, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aP = new c[]{new c(3, 176, new z(0, 0, 26, 34), 8, 0), new c(3, 176, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aQ = new c[]{new c(3, 166, new z(0, 0, 32, 36), 8, 0), new c(3, 166, new z(32, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aR = new c[]{new c(3, 186, new z(52, 0, 26, 34), 8, 0), new c(3, 186, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aS = new c[]{new c(3, 176, new z(52, 0, 26, 34), 8, 0), new c(3, 176, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aT = new c[]{new c(3, 166, new z(64, 0, 32, 36), 8, 0), new c(3, 166, new z(96, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aU = new c[]{new c(3, 186, new z(104, 0, 26, 34), 8, 0), new c(3, 186, new z(130, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aV = new c[]{new c(3, 176, new z(104, 0, 26, 34), 8, 0), new c(3, 176, new z(130, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aW = new c[]{new c(3, 166, new z(128, 0, 32, 36), 8, 0), new c(3, 166, new z(160, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aX = new c[]{new c(3, 195, new z(52, 0, 26, 34), 8, 0), new c(3, 195, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aY = new c[]{new c(3, 195, new z(0, 34, 26, 34), 8, 0), new c(3, 195, new z(26, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] aZ = new c[]{new c(3, 195, new z(104, 34, 26, 34), 8, 0), new c(3, 195, new z(130, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ba = new c[]{new c(3, 193, new z(0, 0, 26, 34), 8, 0), new c(3, 193, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bb = new c[]{new c(3, 183, new z(0, 0, 26, 34), 8, 0), new c(3, 183, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bc = new c[]{new c(3, 173, new z(0, 0, 26, 34), 8, 0), new c(3, 173, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bd = new c[]{new c(3, 193, new z(52, 0, 26, 34), 8, 0), new c(3, 193, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] be = new c[]{new c(3, 183, new z(52, 0, 26, 34), 8, 0), new c(3, 183, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bf = new c[]{new c(3, 173, new z(52, 0, 26, 34), 8, 0), new c(3, 173, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bg = new c[]{new c(3, 191, new z(0, 0, 26, 34), 8, 0), new c(3, 191, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bh = new c[]{new c(3, 181, new z(0, 0, 26, 34), 8, 0), new c(3, 181, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bi = new c[]{new c(3, 171, new z(0, 0, 32, 36), 8, 0), new c(3, 171, new z(32, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bj = new c[]{new c(3, 191, new z(104, 0, 26, 34), 8, 0), new c(3, 191, new z(130, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bk = new c[]{new c(3, 181, new z(104, 0, 26, 34), 8, 0), new c(3, 181, new z(130, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bl = new c[]{new c(3, 171, new z(128, 0, 32, 36), 8, 0), new c(3, 171, new z(160, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bm = new c[]{new c(3, 191, new z(52, 0, 26, 34), 8, 0), new c(3, 191, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bn = new c[]{new c(3, 181, new z(52, 0, 26, 34), 8, 0), new c(3, 181, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bo = new c[]{new c(3, 171, new z(64, 0, 32, 36), 8, 0), new c(3, 171, new z(96, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bp = new c[]{new c(3, 191, new z(0, 34, 26, 34), 8, 0), new c(3, 191, new z(26, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bq = new c[]{new c(3, 181, new z(0, 34, 26, 34), 8, 0), new c(3, 181, new z(26, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] br = new c[]{new c(3, 171, new z(0, 36, 32, 36), 8, 0), new c(3, 171, new z(32, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bs = new c[]{new c(3, 191, new z(52, 34, 26, 34), 8, 0), new c(3, 191, new z(78, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bt = new c[]{new c(3, 181, new z(52, 34, 26, 34), 8, 0), new c(3, 181, new z(78, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bu = new c[]{new c(3, 171, new z(64, 36, 32, 36), 8, 0), new c(3, 171, new z(96, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bv = new c[]{new c(3, 191, new z(104, 34, 26, 34), 8, 0), new c(3, 191, new z(130, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bw = new c[]{new c(3, 181, new z(104, 34, 26, 34), 8, 0), new c(3, 181, new z(130, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bx = new c[]{new c(3, 171, new z(128, 36, 32, 36), 8, 0), new c(3, 171, new z(160, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] by = new c[]{new c(3, 189, new z(0, 0, 26, 36), 8, 0), new c(3, 189, new z(26, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bz = new c[]{new c(3, 179, new z(0, 0, 26, 36), 8, 0), new c(3, 179, new z(26, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bA = new c[]{new c(3, 169, new z(0, 0, 32, 36), 8, 0), new c(3, 169, new z(32, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bB = new c[]{new c(3, 189, new z(104, 0, 26, 36), 8, 0), new c(3, 189, new z(130, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bC = new c[]{new c(3, 179, new z(104, 0, 26, 36), 8, 0), new c(3, 179, new z(130, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bD = new c[]{new c(3, 169, new z(128, 0, 32, 36), 8, 0), new c(3, 169, new z(160, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bE = new c[]{new c(3, 189, new z(52, 0, 26, 36), 8, 0), new c(3, 189, new z(78, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bF = new c[]{new c(3, 179, new z(52, 0, 26, 36), 8, 0), new c(3, 179, new z(78, 0, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bG = new c[]{new c(3, 169, new z(64, 0, 32, 36), 8, 0), new c(3, 169, new z(96, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bH = new c[]{new c(3, 189, new z(0, 36, 26, 36), 8, 0), new c(3, 189, new z(26, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bI = new c[]{new c(3, 179, new z(0, 36, 26, 36), 8, 0), new c(3, 179, new z(26, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bJ = new c[]{new c(3, 169, new z(0, 36, 32, 36), 8, 0), new c(3, 169, new z(32, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bK = new c[]{new c(3, 189, new z(52, 36, 26, 36), 8, 0), new c(3, 189, new z(78, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bL = new c[]{new c(3, 179, new z(52, 36, 26, 36), 8, 0), new c(3, 179, new z(78, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bM = new c[]{new c(3, 169, new z(64, 36, 32, 36), 8, 0), new c(3, 169, new z(96, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bN = new c[]{new c(3, 189, new z(104, 36, 26, 36), 8, 0), new c(3, 189, new z(130, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bO = new c[]{new c(3, 179, new z(104, 36, 26, 36), 8, 0), new c(3, 179, new z(130, 36, 26, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bP = new c[]{new c(3, 169, new z(128, 36, 32, 36), 8, 0), new c(3, 169, new z(160, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bQ = new c[]{new c(3, 187, new z(0, 0, 26, 34), 8, 0), new c(3, 187, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bR = new c[]{new c(3, 177, new z(0, 0, 26, 34), 8, 0), new c(3, 177, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bS = new c[]{new c(3, 167, new z(0, 0, 32, 36), 8, 0), new c(3, 167, new z(32, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bT = new c[]{new c(3, 187, new z(104, 0, 26, 34), 8, 0), new c(3, 187, new z(130, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bU = new c[]{new c(3, 177, new z(104, 0, 26, 34), 8, 0), new c(3, 177, new z(130, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bV = new c[]{new c(3, 167, new z(128, 0, 32, 36), 8, 0), new c(3, 167, new z(160, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bW = new c[]{new c(3, 187, new z(52, 0, 26, 34), 8, 0), new c(3, 187, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bX = new c[]{new c(3, 177, new z(52, 0, 26, 34), 8, 0), new c(3, 177, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bY = new c[]{new c(3, 167, new z(64, 0, 32, 36), 8, 0), new c(3, 167, new z(96, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] bZ = new c[]{new c(3, 187, new z(0, 34, 26, 34), 8, 0), new c(3, 187, new z(26, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ca = new c[]{new c(3, 177, new z(0, 34, 26, 34), 8, 0), new c(3, 177, new z(26, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cb = new c[]{new c(3, 167, new z(0, 36, 32, 36), 8, 0), new c(3, 167, new z(32, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cc = new c[]{new c(3, 187, new z(52, 34, 26, 34), 8, 0), new c(3, 187, new z(78, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cd = new c[]{new c(3, 177, new z(52, 34, 26, 34), 8, 0), new c(3, 177, new z(78, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ce = new c[]{new c(3, 167, new z(64, 36, 32, 36), 8, 0), new c(3, 167, new z(96, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cf = new c[]{new c(3, 187, new z(104, 34, 26, 34), 8, 0), new c(3, 187, new z(130, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cg = new c[]{new c(3, 177, new z(104, 34, 26, 34), 8, 0), new c(3, 177, new z(130, 34, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ch = new c[]{new c(3, 167, new z(128, 36, 32, 36), 8, 0), new c(3, 167, new z(160, 36, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ci = new c[]{new c(3, 185, new z(0, 0, 26, 34), 8, 0), new c(3, 185, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cj = new c[]{new c(3, 175, new z(0, 0, 26, 34), 8, 0), new c(3, 175, new z(26, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] ck = new c[]{new c(3, 165, new z(0, 0, 32, 36), 8, 0), new c(3, 165, new z(32, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cl = new c[]{new c(3, 185, new z(52, 0, 26, 34), 8, 0), new c(3, 185, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cm = new c[]{new c(3, 175, new z(52, 0, 26, 34), 8, 0), new c(3, 175, new z(78, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cn = new c[]{new c(3, 165, new z(64, 0, 32, 36), 8, 0), new c(3, 165, new z(96, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] co = new c[]{new c(3, 185, new z(104, 0, 26, 34), 8, 0), new c(3, 185, new z(130, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cp = new c[]{new c(3, 175, new z(104, 0, 26, 34), 8, 0), new c(3, 175, new z(130, 0, 26, 34), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cq = new c[]{new c(3, 165, new z(128, 0, 32, 36), 8, 0), new c(3, 165, new z(160, 0, 32, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cr = new c[]{new c(3, 158, new z(0, 0, 84, 89), 8, 0), new c(3, 158, new z(84, 0, 84, 89), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cs = new c[]{new c(3, 158, new z(0, 89, 95, 89), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] ct = new c[]{new c(3, 158, new z(99, 93, 90, 85), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cu = new c[]{new c(3, 157, new z(0, 0, 70, 65), 8, 0), new c(3, 157, new z(70, 0, 70, 65), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cv = new c[]{new c(3, 157, new z(0, 65, 70, 78), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cw = new c[]{new c(3, 157, new z(70, 81, 80, 62), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cx = new c[]{new c(3, 156, new z(0, 0, 49, 48), 8, 0), new c(3, 156, new z(49, 0, 47, 48), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cy = new c[]{new c(3, 156, new z(97, 0, 47, 48), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cz = new c[]{new c(3, 156, new z(144, 0, 56, 48), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cA = new c[]{new c(3, 155, new z(0, 0, 32, 45), 8, 0), new c(3, 155, new z(32, 0, 32, 45), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cB = new c[]{new c(3, 155, new z(64, 0, 32, 45), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cC = new c[]{new c(3, 155, new z(96, 0, 48, 45), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cD = new c[]{new c(3, 154, new z(0, 0, 24, 32), 8, 0), new c(3, 154, new z(24, 0, 24, 32), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cE = new c[]{new c(3, 154, new z(48, 0, 24, 32), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cF = new c[]{new c(3, 154, new z(72, 0, 24, 32), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cG = new c[]{new c(3, 153, new z(0, 0, 100, 100), 8, 0), new c(3, 153, new z(100, 0, 100, 100), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cH = new c[]{new c(3, 153, new z(0, 100, 100, 100), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cI = new c[]{new c(3, 153, new z(100, 100, 100, 100), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cJ = new c[]{new c(3, 152, new z(0, 0, 30, 36), 8, 0), new c(3, 152, new z(30, 0, 30, 36), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cK = new c[]{new c(3, 152, new z(58, 0, 30, 36), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cL = new c[]{new c(3, 152, new z(88, 0, 37, 36), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cM = new c[]{new c(3, 151, new z(0, 0, 24, 18), 8, 0), new c(3, 151, new z(24, 0, 24, 18), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cN = new c[]{new c(3, 151, new z(48, 0, 24, 18), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cO = new c[]{new c(3, 151, new z(72, 0, 26, 18), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cP = new c[]{new c(3, 162, new z(0, 0, 24, 22), 8, 0), new c(3, 162, new z(24, 0, 24, 22), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cQ = new c[]{new c(3, 162, new z(24, 0, 24, 22), 8, 0), new c(3, 162, new z(0, 0, 24, 22), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cR = new c[]{new c(9, 162, new z(0, 0, 24, 22), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cS = new c[]{new c(9, 21, new z(0, 0, 16, 18), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cT = new c[]{new c(9, 21, new z(16, 0, 25, 17), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cU = new c[]{new c(9, 21, new z(41, 0, 25, 17), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cV = new c[]{new c(4, 21, new z(66, 0, 20, 17), 8, 0), new c(4, 21, new z(86, 0, 20, 17), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] cW = new c[]{new c(9, 21, new z(88, 54, 44, 36), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cX = new c[]{new c(9, 21, new z(106, 0, 26, 28), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cY = new c[]{new c(9, 21, new z(0, 18, 29, 33), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] cZ = new c[]{new c(9, 21, new z(29, 17, 25, 34), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] da = new c[]{new c(4, 21, new z(56, 17, 23, 27), 8, 0), new c(4, 21, new z(79, 17, 23, 27), 8, 0), new c(0, 1, 0, 0)};
    private static final c[] db = new c[]{new c(9, 21, new z(60, 75, 22, 14), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] dc = new c[]{new c(9, 21, new z(62, 50, 21, 17), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] dd = new c[]{new c(9, 21, new z(0, 81, 55, 9), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] de = new c[]{new c(9, 21, new z(0, 51, 56, 30), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] df = new c[]{new c(9, 21, new z(103, 28, 12, 20), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] dg = new c[]{new c(9, 149, new z(0, 0, 14, 5), 8, 0), new c(0, 0, 0, 0)};
    private static final c[] dh = new c[]{new c(4, 149, new z(14, 0, 40, 28), 8, 0), new c(4, 149, new z(54, 0, 40, 28), 8, 0), new c(0, 1, 0, 0)};
    private m[] di;

    public acClass() {
        this.di = new m[]{new m(0, M), new m(3, P), new m(6, S), new m(9, V), new m(12, Y), new m(15, ab), new m(18, ae), new m(21, ah), new m(24, ak), new m(27, an), new m(30, aq), new m(33, at), new m(36, aw), new m(39, az), new m(42, aC), new m(45, aF), new m(48, aI), new m(51, aL), new m(54, aO), new m(57, aR), new m(60, aU), new m(1, N), new m(4, Q), new m(7, T), new m(10, W), new m(13, Z), new m(16, ac), new m(19, af), new m(22, ai), new m(25, al), new m(28, ao), new m(31, ar), new m(34, au), new m(37, ax), new m(40, aA), new m(43, aD), new m(46, aG), new m(49, aJ), new m(52, aM), new m(55, aP), new m(58, aS), new m(61, aV), new m(2, O), new m(5, R), new m(8, U), new m(11, X), new m(14, aa), new m(17, ad), new m(20, ag), new m(23, aj), new m(26, am), new m(29, ap), new m(32, as), new m(35, av), new m(38, ay), new m(41, aB), new m(44, aE), new m(47, aH), new m(50, aK), new m(53, aN), new m(56, aQ), new m(59, aT), new m(62, aW), new m(135, cr), new m(136, cs), new m(137, ct), new m(138, cu), new m(139, cv), new m(140, cw), new m(141, cx), new m(142, cy), new m(143, cz), new m(144, cA), new m(145, cB), new m(146, cC), new m(147, cD), new m(148, cE), new m(149, cF), new m(150, cG), new m(151, cH), new m(152, cI), new m(153, cJ), new m(154, cK), new m(155, cL), new m(156, cM), new m(157, cN), new m(158, cO), new m(159, cP), new m(160, cQ), new m(161, cR), new m(162, cS), new m(163, cT), new m(164, cU), new m(165, cV), new m(166, cW), new m(167, cX), new m(168, cY), new m(169, cZ), new m(170, da), new m(171, db), new m(172, dc), new m(173, dd), new m(174, de), new m(175, df), new m(176, dg), new m(177, dh), new m(63, aX), new m(66, ba), new m(69, bd), new m(72, bg), new m(75, bj), new m(78, bm), new m(81, bp), new m(84, bs), new m(87, bv), new m(90, by), new m(93, bB), new m(96, bE), new m(99, bH), new m(102, bK), new m(105, bN), new m(108, bQ), new m(111, bT), new m(114, bW), new m(117, bZ), new m(120, cc), new m(123, cf), new m(126, ci), new m(129, cl), new m(132, co), new m(64, aY), new m(67, bb), new m(70, be), new m(73, bh), new m(76, bk), new m(79, bn), new m(82, bq), new m(85, bt), new m(88, bw), new m(91, bz), new m(94, bC), new m(97, bF), new m(100, bI), new m(103, bL), new m(106, bO), new m(109, bR), new m(112, bU), new m(115, bX), new m(118, ca), new m(121, cd), new m(124, cg), new m(127, cj), new m(130, cm), new m(133, cp), new m(65, aZ), new m(68, bc), new m(71, bf), new m(74, bi), new m(77, bl), new m(80, bo), new m(83, br), new m(86, bu), new m(89, bx), new m(92, bA), new m(95, bD), new m(98, bG), new m(101, bJ), new m(104, bM), new m(107, bP), new m(110, bS), new m(113, bV), new m(116, bY), new m(119, cb), new m(122, ce), new m(125, ch), new m(128, ck), new m(131, cn), new m(134, cq)};
    }

    public final boolean a() {
        this.i(4095);
        this.h(0);
        return true;
    }

    public final void b() {
    }

    public final void c() {
        o = this.n();
        int var2;
        switch(this.o()) {
            case 0:
                aiClass.b();
                if(Canvas.d) {
                    aiClass.a &= -17;
                } else {
                    aiClass.a |= 16;
                }

                if((aiClass.a & 16) == 0) {
                    Canvas.b(true);
                }

                g = null;
                Canvas.a(H, d, MESSAGES, this.di, true);
                aiClass.y = (p) Canvas.a(new p(), this);
                aiClass.A = (al) Canvas.a(new al());
                this.h(7);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                break;
            case 7:
                if(q) {
                    int var3;
                    switch(p) {
                        case 0:
                            if(o == 0) {
                                Canvas.option(0, null);
                                Canvas.option(1, null);
                                t[0].setFlag2(true);
                                t[n + 1].setFlag2(true);
                            } else {
                                a(29);
                                if(Canvas.e(65536) && !b) {
                                    if(--n < 0) {
                                        n = 7;
                                    }

                                    if(!r && n == 1) {
                                        --n;
                                    }

                                    f();
                                } else if(Canvas.e(262144) && !b) {
                                    if(++n >= 8) {
                                        n = 0;
                                    }

                                    if(!r && n == 1) {
                                        ++n;
                                    }

                                    f();
                                } else if(!Canvas.d(4194304) && (!b || !Canvas.d(2097152) && !Canvas.d(1048576)) && Canvas.d(1048576)) {
                                    for(var3 = 0; var3 < 9; ++var3) {
                                        t[var3].setFlag2(false);
                                    }

                                    if(n == 2) {
                                        p = 6;
                                    } else if(n == 3) {
                                        p = 2;
                                    } else if(n == 4) {
                                        p = 8;
                                    } else if(n == 5) {
                                        p = 3;
                                    } else if(n == 6) {
                                        p = 7;
                                    } else if(n == 7) {
                                        p = 9;
                                    } else {
                                        Canvas.d();
                                        m = -1;
                                        p = 1;
                                    }

                                    this.g(0);
                                }
                            }
                            break;
                        case 1:
                            if(o == 2) {
                                Canvas.option(0, null);
                                Canvas.option(1, null);
                                switch(n) {
                                    case 0:
                                        l = 0;
                                        break;
                                    case 1:
                                        l = 1;
                                }

                                if(l == 0 && r) {
                                    p = 4;
                                    this.g(0);
                                } else {
                                    if(l == 0 || l == 1) {
                                        this.h(8);
                                    }

                                    q = false;
                                }
                            }
                            break;
                        case 2:
                            if(k == null) {
                                a = false;
                                k = (f) Canvas.a(new f(), this);
                            } else if(!k.isFlag1()) {
                                p = 0;
                                this.g(0);
                                k = null;
                            }
                            break;
                        case 3:
                            if(j == null) {
                                for(var2 = 0; var2 < 15; ++var2) {
                                    h[var2].setFlag2(false);
                                }

                                j = (u) Canvas.a(new u(2, 0), this);
                            } else if(!j.isFlag1()) {
                                for(var2 = 0; var2 < 15; ++var2) {
                                    h[var2].setFlag2(true);
                                }

                                p = 0;
                                this.g(0);
                                j = null;
                            }
                            break;
                        case 4:
                            if(o == 0) {
                                i[0].setColor(10703744);
                                i[0].a(12, 12);
                                i[0].f(60, 144);
                                i[0].a("确定重新开始吗？");
                                i[0].g(0);
                                i[0].setFlag2(true);
                                h[15].b(240, 320);
                                h[15].setColor(14993624);
                                h[15].g(1);
                                h[15].setFlag2(true);
                                Canvas.option(1, "否");
                                Canvas.option(0, "是");
                            } else if(Canvas.d(4194304)) {
                                i[0].setFlag2(false);
                                h[15].setFlag2(false);
                                h[15].b(0, 0);
                                p = 0;
                                this.g(0);
                            } else if(Canvas.d(2097152)) {
                                r = false;
                                p = 1;
                                this.g(0);
                            }
                            break;
                        case 5:
                            if(o == 0) {
                                s[0].setFlag2(false);
                                s[1].setFlag2(false);
                                s[2].setFlag2(false);
                                s[3].setFlag2(false);
                                s[4].setFlag2(false);
                                Canvas.b(i);
                                i = null;
                                Canvas.b(h);
                                h = null;
                                Canvas.a(this.K, null, null, null);
                                s[5].g(1);
                                s[5].f(0, 0);
                                s[5].setFlag2(true);
                            } else if(Canvas.d(4194304)) {
                                Canvas.a();
                            } else if(Canvas.d(2097152)) {
                                (new au(true)).start();
                            }
                            break;
                        case 6:
                            if(!c) {
                                Canvas.b(215, 204);
                                this.u = new d[5];
                                Canvas.a(this.u);
                                this.u[0].a(215, 0);
                                this.u[1].b(240, 320);
                                this.u[2].a(231);
                                this.u[3].a(232);
                                this.u[4].a(233);
                                this.u[0].g(0);
                                this.u[1].g(1);
                                this.u[2].g(0);
                                this.u[3].g(0);
                                this.u[4].g(0);
                                this.u[0].f(120, 160);
                                this.u[3].f(240 - this.u[2].b() - 2, 320 - this.u[2].c() - 2);
                                this.u[2].f(2, 320 - this.u[3].c() - 2);
                                this.u[4].f(240 - this.u[4].b() >> 1, this.u[3].g() - 10);
                                this.u[0].setFlag2(false);
                                this.u[1].setFlag2(false);
                                this.u[2].setFlag2(false);
                                this.u[3].setFlag2(false);
                                this.u[4].setFlag2(false);
                                Canvas.f();
                                c = true;
                            } else {
                                this.u[0].setFlag2(true);
                                this.u[1].setFlag2(true);
                                this.u[2].setFlag2(true);
                                this.u[3].setFlag2(true);
                                this.u[4].setFlag2(true);
                                if(Canvas.d(4194304)) {
                                    this.u[0].setFlag2(false);
                                    this.u[1].setFlag2(false);
                                    this.u[2].setFlag2(false);
                                    this.u[3].setFlag2(false);
                                    this.u[4].setFlag2(false);
                                    c = false;
                                    Canvas.e();
                                } else if(Canvas.d(2097152)) {
                                    (new au(true)).start();
                                }

                                if(!c) {
                                    Canvas.b(this.u);
                                    this.u = null;
                                    Canvas.nullImage(215);
                                    p = 0;
                                    this.g(0);
                                }
                            }
                            break;
                        case 7:
                            if(!this.w) {
                                Canvas.b(133, 133);
                                this.v = new d[1];
                                Canvas.a(this.v);
                                this.v[0].a(133, 0);
                                this.v[0].g(0);
                                this.v[0].f(120, 160);
                                this.v[0].setFlag2(false);
                                Canvas.option(1, "返回");
                                Canvas.option(0, null);
                                this.w = true;
                            } else {
                                this.v[0].setFlag2(true);
                                if(Canvas.d(4194304)) {
                                    this.v[0].setFlag2(false);
                                    this.w = false;
                                }

                                if(!this.w) {
                                    Canvas.b(this.v);
                                    this.v = null;
                                    Canvas.nullImage(133);
                                    p = 0;
                                    this.g(0);
                                }
                            }
                            break;
                        case 8:
                            if(!this.C) {
                                this.A = 0;
                                this.B = 0;
                                this.z = 0;
                                this.y = new at[1];
                                Canvas.a(this.y);
                                this.x = new d[3];
                                Canvas.a(this.x);
                                this.x[0].b(240, 320);
                                this.x[0].setColor(14993624);
                                this.x[0].g(6144);
                                this.x[1].a(163, 0, new z(13, 0, 12, 15));
                                this.x[1].g(6143);
                                this.x[1].setFlag2(false);
                                this.x[2].a(163, 0, new z(25, 0, 12, 15));
                                this.x[2].g(6143);
                                this.x[2].setFlag2(false);
                                this.e();
                                Canvas.option(1, "返回");
                                Canvas.option(0, null);
                                this.C = true;
                            } else {
                                o = this.n();
                                switch(this.z) {
                                    case 0:
                                        Canvas.option(1, "返回");
                                        Canvas.option(0, null);
                                        this.x[1].setFlag2(true);
                                        this.x[2].setFlag2(true);
                                        this.z = 1;
                                        this.g(0);
                                        break;
                                    case 1:
                                        if(!Canvas.e(65536) && !Canvas.e(131072)) {
                                            if(!Canvas.e(262144) && !Canvas.e(524288)) {
                                                if(Canvas.d(4194304)) {
                                                    this.z = 2;
                                                    this.g(0);
                                                }
                                                break;
                                            }

                                            if(++this.B >= 21) {
                                                this.B = 0;
                                            }

                                            this.e();
                                            break;
                                        }

                                        if(--this.B < 0) {
                                            this.B = 20;
                                        }

                                        this.e();
                                        break;
                                    case 2:
                                        if(o == 0) {
                                            this.x[1].setFlag2(false);
                                            this.x[2].setFlag2(false);
                                        } else if(o == 2) {
                                            this.C = false;
                                        }
                                }

                                var3 = Canvas.sin(18 * (this.A % 6)) << 3 >> 8;
                                this.x[1].f(20 - var3, 160);
                                this.x[2].f(var3 + 220, 160);
                                ++this.A;
                                if(!this.C) {
                                    Canvas.b(this.x);
                                    this.x = null;
                                    Canvas.b(this.y);
                                    this.y = null;
                                    p = 0;
                                    this.g(0);
                                }
                            }
                            break;
                        case 9:
                            if(o == 0) {
                                s[1].setFlag2(true);
                                s[1].g(1);
                                s[0].g(0);
                                s[0].f(240 - s[0].b() >> 1, 320 - s[0].c() >> 1);
                                s[0].setFlag2(true);
                                s[2].g(0);
                                s[3].g(0);
                                s[2].f(240 - s[2].b() - 2, 320 - s[2].c() - 2);
                                s[3].f(2, 320 - s[3].c() - 2);
                                s[4].f(240 - s[4].b() >> 1, s[3].g() - 10);
                                s[2].setFlag2(true);
                                s[3].setFlag2(true);
                                s[4].setFlag2(true);
                                Canvas.f();
                                b = true;
                            } else if(Canvas.d(4194304)) {
                                p = 5;
                                this.g(0);
                            } else if(Canvas.d(2097152)) {
                                Canvas.e();
                                s[0].setFlag2(false);
                                s[1].setFlag2(false);
                                s[2].setFlag2(false);
                                s[3].setFlag2(false);
                                s[4].setFlag2(false);
                                p = 0;
                                b = false;
                                Canvas.option(0, null);
                                Canvas.option(1, null);
                                this.g(0);
                            }
                    }

                    if(!q) {
                        Canvas.b(i);
                        i = null;
                        Canvas.b(h);
                        h = null;
                        Canvas.a(this.K, null, null, null);
                        Canvas.nullImage(230);
                        Canvas.nullImage(233);
                        Canvas.nullImage(234);
                        Canvas.nullImage(240);
                        Canvas.nullImage(241);
                    }

                    return;
                }

                Canvas.c(8);
                n = (r = (aiClass.a & 1) != 0)?1:0;
                k = null;
                j = null;
                Canvas.a(this.K, null, null, null, false);
                Canvas.b(230, 130);
                Canvas.b(231, 200);
                Canvas.b(232, 201);
                Canvas.b(233, 202);
                Canvas.b(234, 203);
                Canvas.b(240, 300);
                Canvas.b(241, 301);
                Canvas.a(s = new d[6]);
                s[0].a(230);
                s[0].setFlag2(false);
                s[1].b(240, 320);
                s[1].a(0, 0, 0);
                s[2].a(231);
                s[3].a(232);
                s[4].a(233);
                s[5].a(234);
                s[1].setFlag2(false);
                s[2].setFlag2(false);
                s[3].setFlag2(false);
                s[4].setFlag2(false);
                s[5].setFlag2(false);
                Canvas.a(t = new d[9]);
                t[0].a(240, 1);
                t[0].g(1);

                for(var2 = 0; var2 < 8; ++var2) {
                    t[var2 + 1].a(241, 1, new z(0, var2 * 20, 70, 20));
                    t[var2 + 1].g(0);
                }

                for(var2 = 0; var2 < 9; ++var2) {
                    t[var2].setFlag2(false);
                    t[var2].f(240 - t[var2].b() >> 1, 320 + Canvas.b - (t[var2].c() >> 1));
                }

                Canvas.a(h = new d[16]);
                Canvas.a(h, L);
                h[2].setColor(16777215);
                h[2].b(240, 320);
                h[2].f(0, 0);
                h[2].g(32767);
                h[9].c(24);
                h[10].c(78);
                h[11].c(44);
                h[12].c(118);
                Canvas.a(i = new at[1]);
                Canvas.f(0);
                f();
                p = 0;
                q = true;
                this.g(0);
                break;
            case 8:
                if(g != null) {
                    if(!g.isFlag1()) {
                        switch(g.l()) {
                            case 3:
                                this.h(9);
                                break;
                            case 4:
                                this.h(7);
                        }

                        g = null;
                    }

                    return;
                }

                g = (sClass) Canvas.a(new sClass(l), this);
                break;
            case 9:
                if(!q) {
                    j = null;
                    Canvas.a(I, null, null, null, false);
                    Canvas.a(h = new d[2]);
                    Canvas.a(h, J);
                    Canvas.setFlagTrue(8);
                    q = true;
                    p = 0;
                    this.g(0);
                    return;
                }

                switch(p) {
                    case 0:
                        if(o == 0) {
                            aiClass.b(1);
                            Canvas.option(0, "继续");
                        } else if(Canvas.d(2097152)) {
                            aiClass.b(22);
                            Canvas.option(1, null);
                            p = 1;
                            this.g(0);
                        }
                        break;
                    case 1:
                        if(j != null) {
                            if(!j.isFlag1()) {
                                j = null;
                                p = 2;
                                this.g(0);
                            }
                            break;
                        }

                        for(var2 = 0; var2 < 2; ++var2) {
                            h[var2].setFlag2(false);
                        }

                        byte var4;
                        if((aiClass.a & 8) != 0) {
                            var4 = 1;
                        } else {
                            var4 = 0;
                        }

                        j = (u) Canvas.a(new u(var4, aiClass.t), this);
                        break;
                    case 2:
                        if(o == 2) {
                            q = false;
                        }
                }

                if(!q) {
                    Canvas.b(h);
                    h = null;
                    Canvas.a(I, null, null, null);
                    Canvas.c(8);
                    this.h(7);
                }
        }

    }

    private void e() {
        this.y[0].f(36, 24);
        this.y[0].a(12, 25);
        this.y[0].g(6142);
        this.y[0].a(86 + this.B);
        this.y[0].setColor(10703744);
    }

    private static void f() {
        for(int var0 = 0; var0 < 8; ++var0) {
            t[var0 + 1].setFlag2(false);
            t[n + 1].setFlag2(true);
        }

    }

    public static void a(int var0) {
        if(m != var0) {
            Canvas.d();
            m = var0;
            if(var0 == 29) {
                Canvas.a(var0, true);
            }
        }

    }

    public static void d() {
        Canvas.d();
        m = -1;
    }

    public static void a(int var0, int var1) {
        Canvas.b(var0, false);
    }

    public static int a(char var0) {
        String var1 = Canvas.getMessage(216); // "下不中丹丽了人他伊休伤伽位候儿其冰凡凯判前劣化卡危即卷受古啦啸器图垛夏多天奈始娜婖婴孔孕季宏尚已巴布幼开式强徙徳怀恐息恶惠戏打文族旧昌晴暑期机束来果枫桑欧正气水河波泰洪海游火灭灾烂物狩猎玛琳瑞瑟生疫病皮石禆空米纱结绝罗美老腐腹芋芬莉菁萨落蒙虞裘言詹谈足迁进造部采金长阳集雨雪雷露风食龙祈祷　　　　　　　　　　　　　　　　"

        for(int var2 = 0; var2 < 160; ++var2) {
            if(var0 == var1.charAt(var2)) {
                return var2;
            }
        }

        return 159;
    }

    static String getNumberString(int var0, int digitWidth, boolean var2) {
        boolean var3 = var2;
        String var6;
        if(var0 < 0) {
            var6 = "－";
        } else {
            var6 = "";
        }

        var0 = Math.abs(var0);

        for(int i = 0; i < digitWidth; ++i) {
            int digit;
            if((digit = var0 / acClass.digit[digitWidth - i - 1] % 10) <= 0 && !var3 && (digit != 0 || i != digitWidth - 1)) {
                digit = 11;
            } else {
                var3 = true;
            }

            var6 = var6 + NUMBER[digit];
        }

        return var6;
    }

    static String getSeason(int var0) {
        return SEASONS[var0];
    }

    static String getGender(int var0) {
        return GENDER[var0];
    }
}
