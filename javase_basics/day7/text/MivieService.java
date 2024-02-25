package itheima.day7.text;

import itheima.day7.domain.Movie;

import java.util.Scanner;

public class MivieService {
    Scanner sc =new Scanner(System.in);
    Movie[] movies;

    public MivieService(Movie[] movies) {
        this.movies=movies;
    }

    public void start() {

        lo:
        while (true) {
            System.out.println("----------电影信息系统----------");
            System.out.println("请输入您的选择:");
            System.out.println("1. 查询全部电影信息");
            System.out.println("2. 根据id查询电影信息");
            System.out.println("3. 退出");
            int chore = sc.nextInt();
            switch (chore){
                case 1:
                    getMovies1();
                    break ;
                case 2:
                    getMovies2();
                    break ;
                case 3:
                    System.out.println("退出，欢迎您下次使用");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break ;
            }
        }

    }

    private void getMovies2() {
        System.out.println("请输入你想查看的电影编号");
        int id=sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            if(movie.getId() == id){
                System.out.println(movie.getId()+"---"+movie.getTitle()+"---"+movie.getTime()
                +"---"+movie.getScoer()+"---"+movie.getArea()+"---"+movie.getType()+"---"+
                        movie.getDirector()+"---"+movie.getStarring());
                return;
            }
            System.out.println("您的输入有误,请重新输入");

        }
    }

    private void getMovies1() {
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getTitle()+"----"+movie.getScoer());
        }
    }
}
