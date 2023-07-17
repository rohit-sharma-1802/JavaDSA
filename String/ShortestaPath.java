public class ShortestaPath {
    public static float shortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'E' || c == 'e')
                x++;
            else if (c == 'W' || c == 'w')
                x--;
            else if (c == 'N' || c == 'n')
                y++;
            else
                y--;
        }
        int sq = x * x + y * y;
        return (float) Math.sqrt(sq);
    }

    public static void main(String[] args) {
        String path = "wnse";
        System.out.println(shortestPath(path));
    }
}
