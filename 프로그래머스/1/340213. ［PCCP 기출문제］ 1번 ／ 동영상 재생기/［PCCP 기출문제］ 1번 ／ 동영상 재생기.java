class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        //비디오 길이
        int v = Integer.parseInt(video_len.split(":")[0])*60 + Integer.parseInt(video_len.split(":")[1]);
        //현재 위치
        int p = Integer.parseInt(pos.split(":")[0])*60 + Integer.parseInt(pos.split(":")[1]);
        //오프닝 시작
        int ops = Integer.parseInt(op_start.split(":")[0])*60 + Integer.parseInt(op_start.split(":")[1]);
        //오프닝 끝
        int ope = Integer.parseInt(op_end.split(":")[0])*60 + Integer.parseInt(op_end.split(":")[1]);
        
        //재생위치가 오프닝 구간일 경우 오프닝 건너뛰기
        if(p >= ops & p <= ope){
            p = ope;
        }
        
        //사용자 입력 확인
        for(String com : commands){
            if(com.equals("prev")){
                if(p<10){
                    p = 0;
                }else{
                    p -= 10;
                }
            }else{
                //남은 시간이 10초 미만
                if(v - p < 10){
                    p = v;
                }else{
                    p +=10;
                }
            }
            //현재 오프닝인구간일때(prev,next했는데 오프닝 구간일경우)
            if(p>=ops & p<= ope){
                p = ope;
            }
        }
        
        String answer = String.format("%02d:%02d", p/60 , p%60);
        
        return answer;
    }
}