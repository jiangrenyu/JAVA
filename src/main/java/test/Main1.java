package test;

/**
 * Created by jiangry01 on 2018/3/14.
 */
public class Main1 {
    public static void main(String args[]){

        String str = "2018-01-28 00:00:00,GP_xinshengjiayuanerqi_ALW_1,广西,贵港,桂平,贝尔,GP_xinshengjiayuanerqi_ALW,GP_xinshengjiayuanerqi_ALW_1,460-00-925005-111,室内,110.060128,23.35608,0,0,20,E,39148,2018-01-28 00:00:00,2018-01-28 01:00:00,43,460-00-925005,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.8175,-119.8175,-119.8175,-119.82,-119.82,-119.82,-119.82,-119.8175,-119.82,-119.8225,-119.8175,-119.825,-119.825,-81.75,-119.825,-119.825,-119.825,-119.8225,-119.8225,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.825,-119.825,-119.825,-119.825,-119.8225,-119.8225,-119.82,-119.82,-119.8225,-119.825,-119.825,-119.825,-119.82,-119.82,-119.82,-119.82,-119.8225,-119.8225,-119.82,-119.8225,-119.82,-119.82,-119.82,-119.8225,-119.8225,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.8225,-119.825,-119.8225,-119.825,-119.8225,-119.82,-119.82,-119.82,-119.8175,-119.8225,-119.8225,-119.8225,-119.8225,-119.8225,-119.8225,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-101.6834937064602,时域干扰|杂散干扰|互调干扰";
        String str1 = "2018-01-28 00:00:00,GP_xinshengjiayuanerqi_ALW_1,广西,贵港,桂平,贝尔,GP_xinshengjiayuanerqi_ALW,GP_xinshengjiayuanerqi_ALW_1,460-00-925005-111,室内,110.060128,23.35608,0,0,20,E,39148,2018-01-28 00:00:00,2018-01-28 01:00:00,43,460-00-925005,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.8175,-119.8175,-119.8175,-119.82,-119.82,-119.82,-119.82,-119.8175,-119.82,-119.8225,-119.8175,-119.825,-119.825,-81.75,-119.825,-119.825,-119.825,-119.8225,-119.8225,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.82,-119.825,-119.825,-119.825,-119.825,-119.8225,-119.8225,-119.82,-119.82,-119.8225,-119.825,-119.825,-119.825,-119.82,-119.82,-119.82,-119.82,-119.8225,-119.8225,-119.82,-119.8225,-119.82,-119.82,-119.82,-119.8225,-119.8225,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.8225,-119.825,-119.8225,-119.825,-119.8225,-119.82,-119.82,-119.82,-119.8175,-119.8225,-119.8225,-119.8225,-119.8225,-119.8225,-119.8225,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-119.825,-101.6834937064602,干扰小区,时域干扰|杂散干扰|互调干扰";
        String str2 = "2018-01-28 23:00:00,BSPGTongLaoZiLou-ELH-2,广西,百色,平果,爱立信,BSPGTongLaoZiLou-ELH,BSPGTongLaoZiLou-ELH-2,460-00-77614-132,室外,107.421129,23.735851,160,217,20,F,38400,2018-01-28 23:00:00,2018-01-29 00:00:00,44.8,460-00-77614,-120.650647,-121.096033,-120.84645075,-120.8839855,-120.8121585,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-88.44143175,-120.820068,-120.6972225,-120.75522825,-120.7932785,-121.1429095,-88.8987293567935,阻塞干扰,21,107.421129,23.735851,0.0";
        String str3 = "2018-01-28 23:00:00,BHPHSWZBaiFenLingLY-ELH-3,广西,北海,合浦,爱立信,BHPHSWZBaiFenLingLY-ELH,BHPHSWZBaiFenLingLY-ELH-3,460-00-927845-73,室外,109.29132,21.80704,320,28,20,F,38400,2018-01-28 23:00:00,2018-01-29 00:00:00,46,460-00-927845,-103.3723465,-103.406549,-103.40042,-103.382568,-103.3978415,-102.71779,-102.788989,-102.7203755,-102.7235785,-102.660076,-102.6750115,-102.6545375,-102.641739,-104.542733,-104.51843,-104.511449,-104.4731825,-104.577968,-104.523537,-104.498137,-104.4726465,-104.530356,-104.5013295,-104.511097,-104.543693,-104.5078805,-104.6834625,-104.7549805,-104.764329,-104.7492785,-104.70158,-104.7916775,-104.6996695,-104.7548345,-104.7375695,-104.7815085,-104.727916,-104.7652805,-104.7337875,-104.4051605,-104.362181,-104.413804,-104.446246,-104.4711205,-104.409413,-104.477509,-104.345409,-104.413962,-104.4831615,-104.538666,-104.5480695,-104.5345685,-103.3678175,-103.2856315,-103.402672,-103.3022995,-103.400951,-103.311079,-103.3276085,-103.3956825,-103.3226665,-103.2636235,-103.35954,-103.3586315,-103.35896,-104.87341,-104.879287,-104.8667775,-104.997869,-104.985459,-104.946883,-104.927347,-104.8185715,-104.863961,-104.8145245,-104.8633165,-104.8084365,-104.910492,-103.9408045,-103.951166,-103.8862275,-103.9131535,-103.911553,-103.8797925,-103.8867255,-103.938105,-103.921797,-103.873685,-103.898706,-103.880651,-103.899747,-103.8608305,-103.88323,-103.86087,-103.886398,-104.323353,-104.348889,-104.325186,-104.308489,-104.238078,-104.06337157552345,时域干扰,3,109.29132,21.80704,0.0,0.0|0.0|0.0";
        String str4 = "2018-01-28 23:00:00,FCGGKChengTouGongSiShuangZLLT-ELH-1,广西,防城港,港口区,爱立信,,FCGGKChengTouGongSiShuangZLLT-ELH-1,460-00-802419-131,室外,108.35676,21.68768,20,82,20,F,38400,2018-01-28 23:00:00,2018-01-29 00:00:00,46,460-00-802419,-103.11417125,-108.430736,-109.6243515,-109.2372535,-109.53088725,-111.1609655,-113.75840975,-102.75733025,-102.98471125,-107.9567595,-108.02917525,-109.3277695,-109.94089325,-99.69306075,-100.03979575,-106.99953325,-107.1768555,-109.52651875,-110.5984885,-111.19173075,-111.91868675,-111.5052325,-111.35389275,-111.63366525,-112.94388225,-112.48295975,-111.8136375,-112.9605425,-112.97125825,-113.45994525,-112.593198,-112.65969675,-113.29383525,-113.78561575,-113.871301,-113.79627525,-113.56783875,-112.992485,-113.2748,-113.82085975,-113.8462055,-113.77746375,-113.7863155,-113.559992,-113.4258725,-114.05506875,-114.74544175,-113.85547825,-114.054695,-112.6078545,-112.0507925,-112.55302725,-113.5190185,-113.8188265,-113.96069125,-113.3008985,-112.8740685,-113.41953375,-112.587074,-112.46279225,-113.193113,-113.96661675,-113.9700305,-114.05040525,-113.66291025,-113.4308245,-113.53829225,-114.0292795,-114.1844605,-113.588448,-113.10505425,-113.69621675,-113.68626125,-113.68654925,-113.2046335,-112.76337625,-112.45246775,-112.66248675,-112.63295675,-112.78226525,-113.092413,-112.67535425,-111.4160395,-110.89834175,-110.810462,-110.5510165,-110.32515925,-109.4983395,-108.30603375,-105.6278135,-105.210605,-98.75589575,-98.43925225,-113.473136,-111.8531745,-110.45594625,-109.94904225,-110.2497685,-108.173254,-103.89047125,-108.74067232436434,互调干扰,15,108.35676,21.68768,0.0";
        String str5 = "2018-01-28 23:00:00,FCGGKQiShaJinChuanGongYeQu-ELH-2,广西,防城港,防城港市,爱立信,FCGGKQiShaJinChuanGongYeQu-ELH,FCGGKQiShaJinChuanGongYeQu-ELH-2,460-00-506844-12,室外,108.44574,21.55494,160,10,20,F,38400,2018-01-28 23:00:00,2018-01-29 00:00:00,49,460-00-506844,-112.72338025,-117.64134825,-116.9573635,-118.294433,-118.2667295,-118.68738325,-118.76549725,-118.5840515,-118.467748,-118.51722775,-118.49038375,-118.55758775,-118.61665075,-118.41566,-118.3305565,-118.44106275,-118.53243275,-118.6228525,-118.597793,-118.55860125,-118.5718795,-118.64933425,-118.64320675,-118.61986075,-118.6473195,-116.4467675,-118.05471325,-117.9582475,-118.49645875,-118.74565775,-118.7316645,-118.79425975,-118.814218,-118.753412,-118.6871995,-118.70019475,-118.67661475,-118.73035825,-118.857614,-117.74294025,-117.65354725,-117.5075245,-117.205238,-116.7234385,-116.091925,-115.23798,-113.922459,-111.6679375,-117.146698,-94.96786175,-95.0702155,-117.24569875,-119.34161325,-119.295702,-119.24464025,-119.27072875,-119.304155,-119.29650475,-119.30011925,-119.34703725,-119.4569325,-119.53299125,-119.44479,-119.37440875,-119.3329375,-118.658661,-118.7501485,-118.78935675,-118.64055375,-118.6063105,-118.79924625,-118.71597,-118.404539,-118.59134975,-117.31132225,-119.6700335,-119.5707385,-119.48720275,-119.608179,-119.79451125,-119.8200265,-119.86318825,-119.84512775,-119.70982,-119.63426625,-119.77894525,-119.816867,-119.73743675,-119.748079,-119.285947,-119.188013,-118.94716225,-119.127499,-120.208032,-120.17940775,-119.86329975,-119.9176725,-118.2159455,-119.131329,-114.25979475,-111.08682039181045,互调干扰,14,108.44574,21.55494";
        String str6 = "@@ :  2018-01-28 23:00:00,BHHCZaiHaiYiFangI-ELW-1,广西,北海,银海区,爱立信,BHHCZaiHaiYiFangI-ELW,BHHCZaiHaiYiFangI-ELW-1,460-00-82839-151,室内,109.11525,21.430789,0,0,20,E,38950,2018-01-28 23:00:00,2018-01-29 00:00:00,46,460-00-82839,-101.380115,-101.13735575,-101.1686995,-100.697446,-101.12091525,-102.3740665,-104.35765875,-104.73467625,-103.8916215,-105.1168485,-103.59052,-103.00868125,-102.71523025,-103.40495575,-104.67497225,-103.939858,-104.60659525,-103.85007325,-103.17880975,-103.7063215,-104.770196,-105.66243625,-103.03463025,-105.275164,-105.32952875,-106.30895175,-107.64952425,-108.325629,-109.4094195,-108.90392425,-113.0302805,-114.368768,-114.42099775,-115.3458025,-114.67515875,-112.42566025,-109.05866775,-109.65217375,-109.0376185,-109.05929325,-109.4203865,-108.4540695,-108.40227,-106.571265,-107.6388875,-106.3046235,-104.71551025,-105.448394,-105.56852275,-107.111961,-106.087779,-107.662778,-105.603575,-104.35812,-106.8453395,-106.739796,-108.37025475,-108.234866,-109.01161375,-108.55724275,-107.30246625,-107.99006875,-107.34656625,-107.9836315,-107.8044655,-107.1106475,-107.02354,-105.038602,-106.93279675,-106.21335975,-106.94816025,-106.30782125,-105.77587775,-106.175882,-104.02572625,-106.39657275,-105.5679115,-106.20460325,-106.17150825,-106.57772225,-106.8698725,-105.67457875,-107.4810695,-106.81986025,-107.146397,-107.5622375,-108.3077605,-110.074927,-110.53773675,-110.445746,-108.59874875,-108.11411425,-107.9383555,-107.79175725,-108.80307075,-104.796849,-106.699262,-106.7316315,-106.3790815,-107.38620175,-105.89717746748747,时域干扰,109.11525,21.430789,0.0";
        String str7 = "2018/1/28 23:00,百色_德保_职业中学_ZLH_2,广西,百色,德保,中兴,百色_德保_职业中学_ZLH,百色_德保_职业中学_ZLH_2,460-00-18859-132,室外,106.612007,23.316603,,,20,F,38400,2018/1/28 23:00,2018/1/29 0:00,52,460-00-18859,-100.5,-99.75,-99.5,-98.5,-97.75,-97,-97.25,-98,-98,-97.5,-97,-97,-97,-97.25,-98,-98.25,-98,-98,-98,-98,-98.75,-99,-99,-99,-99,-100,-101,-101,-101,-101.25,-100.75,-99.75,-99.25,-99.5,-99,-98.75,-98.75,-98.75,-98.75,-99,-99.25,-99,-99,-98.75,-98.75,-98,-97.75,-98,-97.5,-98,-98,-98,-98,-99,-99.25,-99.25,-99.25,-98,-98,-97.75,-98.25,-98,-98,-98.25,-98,-98,-98.25,-99,-99.5,-100,-101,-100,-99,-98.5,-99,-100,-100,-100,-100,-99,-98.25,-99,-98,-96.75,-96.5,-97,-96.5,-96,-96,-96.25,-96,-96,-96,-96.25,-95.5,-95.75,-95,-98.75,-99.25,-97.5,-98.17522489493116,时域干扰,106.62063600000002,23.320062999999994,-104.57473569146747,961.0";
        String str0 = "2018/1/28 23:00,百色_乐业_甘田垮龙坡_拉远_ZLH_1,广西,百色,乐业,中兴,百色_乐业_甘田2_ZLH,百色_乐业_甘田垮龙坡_拉远_ZLH_1,460-00-496819-14,室外,106.495237,24.612099,20,13,20,F,38400,2018/1/28 23:00,2018/1/29 0:00,52,460-00-496819,-94.5,-93.75,-114.5,-117.5,-103.25,-111.5,-110.5,-117,-117,-116.5,-116.5,-116.5,-116.5,-116.5,-116.5,-116.5,-116.75,-117,-116.5,-116.5,-116.25,-116.25,-116.25,-116.5,-116.5,-116.5,-117,-117,-117.25,-117.25,-117,-117,-117,-115.25,-115.25,-116.25,-116.25,-116.75,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-116.25,-116.25,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117.25,-117.25,-117,-117,-117,-117,-117.25,-117.25,-117.25,-117.25,-117.25,-117.25,-117.25,-117,-117,-117,-117,-117,-117,-117,-117,-117,-117,-116.75,-110,-111.75,-103,-117,-114.25,-93.75,-94.5,-107.27586729568758,互调干扰,10,106.54833575,24.76193975,17495.2,106.55325200000001|24.782781999999994|-105.06067921022908|中兴";
        String str01 = "2018/1/28 0:00,百色_德保_龙光徊林_ZLH_2,广西,百色,德保,中兴,百色_德保_龙光徊林_ZLH,百色_德保_龙光徊林_ZLH_2,460-00-77209-132,室外,106.75692,23.10333,115,15,20,F,38400,2018/1/28 0:00,2018/1/28 1:00,52,460-00-77209,-118.5,-119,-119,-119,-119,-119,-119,-119,-119,-101,-101,-118.5,-118.5,-117.75,-118,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-119,-118.75,-119,-119,-119,-118.75,-118.75,-118.75,-118.5,-118.5,-118.25,-118.25,-118.25,-118.25,-118.25,-115.75,-115.75,-118.25,-118,-117.75,-117.5,-117.75,-117.5,-117.25,-117.75,-117.25,-117,-117.25,-116.75,-116.25,-116.25,-116,-116,-116.5,-116,-115.25,-115,-114.75,-113.5,-114,-112.75,-111.25,-110.5,-108.5,-107.25,-105,-103.25,-99.25,-96.25,-90.5,-90,-105.75,-104,-101.25,-103,-97.75,-96.75,-105,-115.25,-113.75,-97.5,-99.75,-118,-119,-119,-117.25,-104.48497496181761,互调干扰,106.756920,23.103330,-104.84042230731995,中兴,1.2666472E7,106.75692023.103330,-90";
        String str02 = "2018-01-28 23:00:00,BSTDShuiNiChang-ELH-2,广西,百色,田东,爱立信,BSTDShuiNiChang-ELH,BSTDShuiNiChang-ELH-2,460-00-507416-12,室外,107.123608,23.546109,230,28,20,F,38400,2018-01-28 23:00:00,2018-01-29 00:00:00,49,460-00-507416,-102.66424,-113.81949575,-111.94083875,-113.544582,-109.8723895,-115.437131,-116.40918775,-115.21983175,-111.56145475,-112.6838645,-116.773025,-117.21655625,-116.09637725,-114.07062825,-116.78323125,-117.503289,-117.55454975,-117.053929,-117.12338375,-117.48904875,-117.56805,-115.353778,-113.47132925,-116.88345325,-116.52919625,-113.8305765,-100.82889975,-105.82609975,-115.71582375,-117.05997675,-117.38510925,-117.3825135,-117.4557145,-117.197995,-117.2219435,-116.6630715,-117.2007485,-117.466469,-117.57946875,-113.7874355,-113.3654995,-117.6603705,-115.68811325,-112.83761325,-116.86380875,-116.01991225,-115.8466825,-117.00287825,-111.40399575,-113.72951725,-113.030463,-115.651887,-115.122814,-112.7567785,-103.40101575,-92.86393075,-99.50460175,-112.201183,-115.0457755,-115.202949,-111.9867915,-109.49700975,-113.12910525,-112.70428675,-107.3967185,-97.76787075,-104.1198715,-114.72638325,-113.10588675,-105.369153,-105.0353505,-113.46092625,-116.4008385,-114.52218325,-114.4222905,-113.9914935,-114.84613675,-116.217885,-112.324873,-112.644951,-116.97039125,-117.59642225,-117.8646595,-117.0401305,-115.975039,-117.27656675,-118.0083625,-118.01155125,-117.938514,-117.8024875,-117.88317275,-116.6806095,-116.59242725,-115.903726,-112.9739635,-116.13456975,-117.4471935,-115.71554275,-115.65573675,-111.95225125,-108.49265209671972,互调干扰,2,107.123608,23.546109,0.0,0.0|0.0|0.0|田东,false";
        String str03 = "2018-01-28 23:00:00,BHYHYaoHaiMingDuI-ELW-1,广西,北海,银海区,爱立信,BHYHYaoHaiMingDuI-ELW,BHYHYaoHaiMingDuI-ELW-1,460-00-800656-151,室内,109.11079,21.44482,0,0,20,E,38950,2018-01-28 23:00:00,2018-01-29 00:00:00,46,460-00-800656,-115.54834175,-115.38597575,-115.53226,-116.05388275,-117.191684,-116.74274,-118.7665945,-116.59542275,-117.260148,-112.8328085,-117.10941525,-111.8988685,-112.25948625,-112.95379325,-113.6744145,-113.77219975,-114.09363775,-113.7928025,-114.3004685,-114.40917875,-115.18247525,-115.7408475,-115.3568625,-116.43697775,-115.94123225,-116.0389005,-115.26497925,-117.95218975,-114.18767225,-113.538581,-113.690703,-113.10424375,-112.710496,-116.871303,-116.84295025,-118.72008825,-117.67178025,-117.12851475,-115.8380445,-107.80482625,-106.235969,-105.52517825,-106.4301865,-104.588939,-106.75345225,-105.441843,-106.2111645,-105.49570375,-105.89284825,-107.2811985,-105.80561925,-107.272248,-107.125371,-106.0925515,-106.306175,-105.44720875,-105.06397375,-106.107297,-106.01978625,-104.8152075,-106.01027125,-106.63396275,-105.49395975,-104.47015625,-105.320755,-106.0466755,-104.49927075,-103.121952,-103.3023005,-102.60321375,-104.28881225,-103.2728485,-104.483287,-104.20374,-103.6686395,-104.8503565,-103.970282,-103.27321375,-104.321431,-105.33350575,-105.106486,-103.806779,-105.765734,-104.7955575,-104.05152075,-103.86097725,-105.25989175,-106.4440065,-103.0769565,-108.97313125,-104.372885,-104.9512085,-104.217219,-104.56801425,-104.9144745,-103.3633785,-105.32419175,-104.39872,-105.89832925,-105.29082375,-106.8696635689001,杂散干扰,109.107136,21.457495,-107.43312230403059,银海区,false";
        String [] data = str03.split(",");

        for(int i=0;i<data.length;i++){
            System.out.println(i+"  "+data[i]);
        }
    }
}