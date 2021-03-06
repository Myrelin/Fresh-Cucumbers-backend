package com.codecool.freshcucumbersbackend.service;

class TopTenMovieLoaderTest {


/*    @Test
    void whenPopulateIsCalled_MoviesAreAddedToMovieStorage_V2() {
        OMDbApiHandler omDbApiHandler = Mockito.mock(OMDbApiHandler.class);
        MovieStorage movieStorage = new MovieStorage();

        TopTenMovieLoader loader = new TopTenMovieLoader(movieStorage, omDbApiHandler);

        List<String> titles = new LinkedList<>();
        when(omDbApiHandler.getSearchedMovieByTitle(anyString())).thenAnswer(
                (Answer<Movie>) invocation -> {
                    Movie m = new Movie();
                    String title = invocation.getArgument(0);
                    m.setTitle(title);
                    titles.add(title);
                    return m;
                }
        );
        loader.populate();

        for (Movie movie : movieStorage.getMovies()) {
            assertTrue(titles.contains(movie.getTitle()));

        }

        assertEquals(TopTenMovieLoader.TOP_10_MOVIE.size(), movieStorage.getMovies().size());
    }
}*/


    // whenDoingX_YShouldHappen
//    @Test
//    void whenPopulateIsCalled_MoviesAreAddedToMovieStorage_V1() {
//        // 2 problems:
//        // MovieStorage is not mocked -- use ArgumentCaptor!
//        // Movie name is hardcoded; just tests for 1 movie! (solved in v2)
//        MovieController movieController = Mockito.mock(MovieController.class);
//        Movie movieIronMan = new Movie();
//        movieIronMan.setTitle("Iron man");
//        when(movieController.searchApiByTitle("Iron man"))
//                .thenReturn(movieIronMan);
//
//        MovieStorage movieStorage = new MovieStorage();
//        TopTenMovieLoader loader = new TopTenMovieLoader(movieStorage, movieController);
//
//        loader.populate();
//        assertTrue(movieStorage.getMovies().contains(movieIronMan));
//    }
//}

}