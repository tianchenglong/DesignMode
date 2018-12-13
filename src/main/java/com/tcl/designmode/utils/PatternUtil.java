package com.tcl.designmode.utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: TianChengLong
 * @Date: 2018/9/27
 * @Description:
 */
public class PatternUtil {
    /**
     * 若果能匹配到只返回，第一个匹配到的，否则 null
     * @param str 需要正则的字符串
     * @param regex 正则表达式
     * @return  若果能匹配到只返回第一个匹配到的，否则 null
     */
    public static String getValue(String str,String regex){
        if(null==str){
            return  null;
        }
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcer  = pattern.matcher(str);

        if(matcer.find()){
            return  matcer.group();

        }else{
            return null;
        }

    }
    public static void main(String[] args){


        String uu = "sdf$$";
        System.out.println(uu+"==========>>"+uu.replace("$",""));

       // System.out.println(PatternUtil.getValue("(())","\\d+"));


        /*String line = "CREATE TABLE `default.testzq`(&&&  `id` int COMMENT ';.', &&&  `name` string COMMENT '&&&�')&&&COMMENT 'K�h'&&&PARTITIONED BY ( &&&  `dept` string COMMENT '��')&&&ROW FORMAT SERDE &&&  'org.apache.hadoop.hive.serde2.lazy.LazySimpleSerDe' &&&STORED AS INPUTFORMAT &&&  'org.apache.hadoop.mapred.TextInputFormat' &&&OUTPUTFORMAT &&&  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'&&&LOCATION&&&  'hdfs://gd-01:8020/apps/hive/warehouse/testzq'&&&TBLPROPERTIES (&&&  'transient_lastDdlTime'='1537935307')&&&";
        //String line ="CREATE TABLE `default.lm_channel_user_t`(&&&  `cuid` string COMMENT '��', &&&  `citic_open_id` string COMMENT '��', &&&  `uid` string COMMENT '��', &&&  `channel_id` string COMMENT '��', &&&  `user_id` string COMMENT '��', &&&  `user_token` string COMMENT '��n', &&&  `refresh_token` string COMMENT '��ken', &&&  `create_time` string COMMENT '��', &&&  `expire_time` string COMMENT '��', &&&  `blockchain_addr` string COMMENT '��?', &&&  `blockchain_priv_key` string COMMENT '��', &&&  `blockchain_create_time` string COMMENT '��?', &&&  `blockchain_update_time` string COMMENT '��')&&&ROW FORMAT DELIMITED &&&  FIELDS TERMINATED BY '\\t' &&&  COLLECTION ITEMS TERMINATED BY '|' &&&  MAP KEYS TERMINATED BY ',' &&&STORED AS INPUTFORMAT &&&  'org.apache.hadoop.mapred.TextInputFormat' &&&OUTPUTFORMAT &&&  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'&&&LOCATION&&&  'hdfs://gd-01:8020/apps/hive/warehouse/lm_channel_user_t'&&&TBLPROPERTIES (&&&  'COLUMN_STATS_ACCURATE'='{\\\"BASIC_STATS\\\":\\\"true\\\"}', &&&  'numFiles'='0', &&&  'numRows'='0', &&&  'rawDataSize'='0', &&&  'totalSize'='0', &&&  'transient_lastDdlTime'='1538970117')&&&";
        if(line.contains("PARTITIONED BY")){
            String partition = line.substring(line.indexOf("PARTITIONED BY ( &&& ")+22,line.indexOf(")&&&ROW"));
            System.out.println(partition);
        }

        System.out.println("'".equals(String.valueOf(line.charAt(line.indexOf("FIELDS TERMINATED BY")+(24)))));*/























       /* if(line.contains("FIELDS TERMINATED BY")){
            int i = 22;
            int j = 0 ;//最大循环次数（防止无限循环下去）
            while (!"'".equals(String.valueOf(line.charAt(line.indexOf("FIELDS TERMINATED BY")+(i)))) && j<20){
                //由于对应的值不固定，且以' 结束,所以要判断值的长度，放在取错；eg: FIELDS TERMINATED BY '\t'   或者  FIELDS TERMINATED BY '\001'
                i ++;
                j ++;
                System.out.println(i);
            }
            System.out.println(line.substring(line.indexOf("FIELDS TERMINATED BY")+22,line.indexOf("FIELDS TERMINATED BY")+i));
        }

        if(line.contains("COLLECTION ITEMS TERMINATED BY")){
            int i = 32;
            int j = 0 ;//最大循环次数（防止无限循环下去）
            while (!"'".equals(String.valueOf(line.charAt(line.indexOf("COLLECTION ITEMS TERMINATED BY")+(i)))) && j<20){
                i ++;
                j ++;
                System.out.println(i);
            }
            System.out.println(line.substring(line.indexOf("COLLECTION ITEMS TERMINATED BY")+32,line.indexOf("COLLECTION ITEMS TERMINATED BY")+i));
        }

        if(line.contains("MAP KEYS TERMINATED BY")){
            int i = 24;
            int j = 0 ;//最大循环次数（防止无限循环下去）
            while (!"'".equals(String.valueOf(line.charAt(line.indexOf("MAP KEYS TERMINATED BY")+(i)))) && j<20){
                i ++;
                j ++;
                System.out.println(i);
            }
            System.out.println(line.substring(line.indexOf("MAP KEYS TERMINATED BY")+24,line.indexOf("MAP KEYS TERMINATED BY")+i));
        }

        Pattern pattern  = Pattern.compile("(INPUTFORMAT.*?)LOCATION");
        Matcher matcer  = pattern.matcher(line);
        if(matcer.find()) {

            String STORED = matcer.group(1).replace("&&&","");
            System.out.println(STORED);
        }*/



       /* List<Map>   data       =  new ArrayList<>();
        Map         tableInfoMap  = null;
        List<Map>   tempMap       = null;
        String      tempData="";


        Pattern pattern  = Pattern.compile("CREATE TABLE `default.lm_channel_user_t`\\(&&&(.*?)&&&LOCATION");
        Matcher matcer  = pattern.matcher(line);

        if(matcer.find()){
            System.out.println(matcer.group(1));
            System.out.println("=============================");
            String lines = matcer.group(1);
            String filed = lines.substring(0,lines.indexOf(")&&&"));
            System.out.println(filed);

            String[] filedsArray  = filed.split(", &&&");
            String[] filedArray   = null;
            for(int i = 0;i<filedsArray.length;i++){
                filedArray  = filedsArray[i].replace("  ","").split(" ");
                tableInfoMap = new HashMap();
                for(int j = 0; j<filedArray.length;j++){
                    System.out.println(filedArray[j]);
                    if(0==j){

                        tableInfoMap.put("is_partitioned",1+"");//是否分区字段（0：是；1否）
                        tableInfoMap.put("column_name",filedArray[j]);
                    }else if(1==j){
                        tableInfoMap.put("data_type",filedArray[j]);
                    }else if(3==j){
                        tableInfoMap.put("column_comment ",filedArray[j]);
                    }
                }
                System.out.println(tableInfoMap.toString());
                data.add(tableInfoMap);
            }


            //System.out.println(filed);

            }
*/



    }
}
